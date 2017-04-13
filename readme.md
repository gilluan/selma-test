# Selma Framework

## Objetivo
Clonar, mapear e transformar objetos de forma automática como se fosse escritos manualmente. Exemplo.: Conversão de Entity para DTO e vice-versa.

## Características
* Mapeamento checado em tempo de compilação
* Não usa reflections
* Usa somente anotação para configuração do código
* Baseado na JSR 269
* Fácil aprendizado
* Suporta mapeamentos customizados a nível de atributos

## Uso

### Declarando um simples mapeamento
```java
	public class Pessoa {
	    	private String nome;
	    	private String sobrenome;
	    	// + Getters and Setters
	}
	public class PessoaDTO {
	    	private String nome;
	    	private String sobrenome;
	    	// + Getters and Setters
	}	
	
	@Mapper
	public interface PessoaMapper {
		Pessoa toEntity(PessoaDTO dto);
		PessoaDTO toDTO(Pessoa pessoa);
	}

	PessoaMapper pessoaMapper = Selma.builder(PessoaMapper.class).build();
	PessoaDTO dto = pessoaMapper.toDTO(in);
	Pessoa entity = pessoaMapper.toEntity(in);
```

### Clone de um objeto

```java

	@Mapper
	public interface PessoaMapper {
		// somente informando que o retorno é o mesmo que o parâmetro
		Pessoa clonePessoa(Pessoa in);
	}

	Pessoa dto = pessoaMapper.clonePessoa(in);

```

### Mapeamento com atributos diferentes

```java

	public class Carro {
	    private String marca;
	    private String nomeComercial;
	    // + Getters and Setters
	}
	
	public class CarroDTO {
	    private String marca;
	    private String modelo;
	    // + Getters and Setters
	}
	
	@Mapper(withCustomFields = {
        	@Field({"modelo", "nomeComercial"})
    	})
	public abstract class CarroMapper {
	    // + assinaturas necessárias    
	}
```

### Mapeamento Ignorando campos que só existem em um lado


```java
	@Builder
	public class Carro {
	    private String marca;
	    private String nomeComercial;
	    private Integer ano;
	    private String placa;
	    // + Getters and Setters
	}
	
	@Builder
	public class CarroDTO {
	    private String marca;
	    private String modelo;
	}
	
	@Mapper(withIgnoreFields = {"ano", "placa"})
	public abstract class CarroMapper {
	    // + assinaturas necessárias    
	}
```
### Mapeando para objetos planos

```java

	public class Endereco {
	    private String logradouro;
	    private String bairro;
	    private String cep;
	    private String numero;
	    private String complemento;
    	}

	
	public class Fornecedor {
	    private Integer id;
	    private String nome;
	    private String cnpj;
	    private Endereco endereco;
        // + Getters and Setters
    	}
	
	public class FornecedorDTO {
	    private Integer id;
	    private String nome;
	    private String cnpj;
	    private String logradouro;
	    private String bairro;
	    private String cep;
	    private String numero;
        // + Getters and Setters
    	}
    
	@Mapper(withCustomFields = {
	        @Field({"endereco.logradouro", "logradouro"}),
	        @Field({"endereco.bairro", "bairro"}),
	        @Field({"endereco.cep", "cep"}),
	        @Field({"endereco.numero", "numero"})
	})
	public interface FornecedorMapper {
		    // + assinaturas necessárias    	
	}
```

### Mapeando para listas

```java 
	@Mapper(
		// + customizacoes quando necessárias
	)
	public interface FornecedorMapper {
		Fornecedor toEntity(FornecedorDTO dto);
		List<Fornecedor> toListEntity(List<FornecedorDTO> dto);
	}
```

### Mapeamento com vários mappers

```java

	@Mapper( 
		withIgnoreFields = {"endereco", "matricula", "nascimento"},
		withCustom = {
			FornecedorMapper.class, 
			ClienteMapper.class, 
			TelefoneMapper.class
		}
	)
	public interface PedidoMapper extends MapperBase<Pedido, PedidoDTO> {
		    // + assinaturas necessárias    	
	}

```

### Implementando conversor manualmente

```java
	@Mapper
	public abstract class CarroMapper {

	    public Carro toEntity(CarroDTO dto) {
	    	return new Carro(dto.getMarca(), dto.getModelo());
	    };
	}
```

### Evitar desabilitar checkagem de forma automática

```java
	// ignora todas a propriedades divergentes
	@Mapper(withIgnoreMissing = IgnoreMissing.ALL)

	// ignora as propriedades que não existem no objeto de entrada
	@Mapper(withIgnoreMissing = IgnoreMissing.SOURCE)

	// ignora as propriedades que não existem no objeto de saída
    	@Map(withIgnoreMissing = IgnoreMissing.DESTINATION)
```

## Código fonte exemplos
[Github - Gilluan](https://github.com/gilluan/selma-test)

[Github - Selma](https://github.com/xebia-france/selma/tree/master/examples)


## Comparação entre outros frameworks de mapeamentos ##

- [Dozer](https://github.com/DozerMapper/dozer)
- [MapStruct](http://mapstruct.org/)
- [ModelMapper](http://modelmapper.org/)
- [Selma](http://www.selma-java.org/)
- [Orika](https://github.com/orika-mapper/orika)
- [JMapper](https://github.com/jmapper-framework/jmapper-core)

### Resultados

Testes executados em:

* OS: macOS Seria
* CPU: 3.1 GHz Intel Core i7, 2 cores, L2 Cache (per Core): 256 KB,  L3 Cache: 4 MB
* RAM: 16 GB 1867 MHz DDR3
* JVM: Oracle 1.8.0_74-b02 64 bits

<table>
    <tr>
        <th>Benchmark</th><th>Mode</th><th>Samples</th><th>Score</th><th>Margin error (+/-)</th><th>Units</th>
    </tr>
    <tr>
        <th>Manual</th><td>thrpt</td><td>200</td><td>16 262 690</td><td>74 221</td><td>ops/s</td>
    </tr>
    <tr>
        <th>Selma</th><td>thrpt</td><td>200</td><td>15 773 717</td><td>99 740</td><td>ops/s</td>
    </tr>
    <tr>        
        <th>MapStruct</th><td>thrpt</td><td>200</td><td>14 518 416</td><td>179 884</td><td>ops/s</td>
    </tr>
    <tr>
        <th>JMapper</th><td>thrpt</td><td>200</td><td>14 492 381</td><td>82 798</td><td>ops/s</td>
    </tr>
    <tr>
        <th>Orika</th><td>thrpt</td><td>200</td><td>3 550 464</td><td>30 533</td><td>ops/s</td>
    </tr>
    <tr>       
        <th>ModelMaper</th><td>thrpt</td><td>200</td><td>256 959</td><td>2 413</td><td>ops/s</td>
    </tr>
    <tr>
        <th>Dozer</th><td>thrpt</td><td>200</td><td>86 607</td><td>488</td><td>ops/s</td>
    </tr>
</table>

Legenda: Quanto maior o score melhor

Total tempo: 00:48:33


### Referências:

https://github.com/arey/java-object-mapper-benchmark

http://www.selma-java.org/
