# SampleApp

Este projeto é um aplicativo Android desenvolvido com Kotlin e Jetpack Compose, projetado para demonstrar minhas habilidades em desenvolvimento mobile. Ele aplica as mais recentes práticas e padrões do ecossistema Android, como Clean Architecture e MVI (Model-View-Intent), oferecendo uma amostra clara de meu conhecimento técnico e de boas práticas de engenharia de software.

## 🚀 Funcionalidades Principais

- **Interface Moderna**: UI construída com Jetpack Compose, utilizando componentes declarativos e responsivos.
- **Arquitetura Limpa**: Aplicação da Clean Architecture e MVI, com separação clara de responsabilidades.
- **Gerenciamento de Estado**: Uso do `State`, `ViewModel`, `ViewAction` e `ViewState` para gerenciamento eficiente do estado.
- **Navegação**: Navegação inicial gerenciada pelo módulo `app`, com as telas organizadas em módulos de features.
- **Injeção de Dependência**: Implementação com [Koin](https://insert-koin.io/), facilitando a injeção de dependências de maneira simples e eficaz.
- **Integração com APIs e Firebase**: Consumo de APIs REST e integração com Firebase.
- **Automação com CI/CD**: Integração com GitHub Actions para automatizar builds e testes a cada Pull Request (PR) aberto.
- **Teste Unitário e Instrumentado**: Testes com `JUnit` e `Espresso` para garantir a qualidade do código.
- **Boas Práticas de Performance**: Utilização de estratégias para otimização de performance e renderização eficiente.

## 📱 Tecnologias Utilizadas

- **Linguagem**: [Kotlin](https://kotlinlang.org/)
- **UI Declarativa**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Arquitetura**: MVI + Clean Architecture
- **Injeção de Dependência**: [Koin](https://insert-koin.io/)
- **Banco de Dados Local**: [Room](https://developer.android.com/jetpack/androidx/releases/room)
- **API**: [Retrofit](https://square.github.io/retrofit/)
- **CI/CD**: [GitHub Actions](https://github.com/features/actions) para automação de build e testes.
- **Firebase**
- **Testes**: [JUnit](https://junit.org/junit5/) + [Espresso](https://developer.android.com/training/testing/espresso)

## 📂 Estrutura do Projeto

O projeto está dividido nos seguintes módulos:

- **app**: Responsável pela lógica inicial de navegação, sem conter telas. Apenas define a estrutura de navegação e orquestração entre as features.
- **base_ui**: Define os componentes de UI reutilizáveis e as configurações globais de interface.
- **data**: Reúne os repositórios de dados e as implementações que comunicam com as fontes de dados.
  - **data_local**: Implementação do armazenamento local de dados, como Room.
  - **data_remote**: Implementação de chamadas de API, como Retrofit.
- **di**: Configuração de injeção de dependência com Koin.
- **domain**: Define a lógica de negócios, casos de uso (use cases) e as interfaces de repositórios.
- **features**: Onde estão organizadas as funcionalidades, cada uma seguindo a estrutura MVI. Exemplo de uma feature:
  - **LoginFeature**
    - **LoginScreen**: Tela de login construída com Jetpack Compose.
    - **LoginViewModel**: Gerenciamento de estado e lógica de negócio.
    - **LoginViewAction**: Ações do usuário na tela.
    - **LoginViewState**: Representa o estado da UI.

## 🧪 Testes

Para rodar os testes unitários e instrumentados:

```bash
./gradlew test
./gradlew connectedAndroidTest
```

## 💡 CI/CD

Este projeto utiliza **GitHub Actions** para automação do processo de build e testes:

- A cada Pull Request (PR) aberto, o GitHub Actions executa os pipelines para rodar os testes e garantir que o código esteja funcionando corretamente antes de ser mesclado.
