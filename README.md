# Projeto Java - Guia de Instalação e Execução

Este guia fornece instruções passo a passo para copiar, compilar e executar o projeto Java disponível no GitHub. Certifique-se de seguir cada etapa cuidadosamente para garantir uma instalação bem-sucedida.

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes requisitos instalados em sua máquina:

- Java Development Kit (JDK) 21 ou superior
- Maven
- Git

## Clone o Repositório

Clone o repositório do GitHub para o seu ambiente local usando o seguinte comando:

```bash
git clone https://github.com/MarhlonKorb/security-auth.git
```
## Build do Projeto
Execute o seguinte comando para construir o projeto com o Maven:

```bash
mvn clean install
```

## Executar Localmente
Após a conclusão da compilação, execute o projeto localmente usando o seguinte comando:
```bash
mvn spring-boot:run
```

## Endpoints disponíveis, acesse link ao rodar o projeto:

http://localhost:8080/swagger-ui/index.html