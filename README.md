# 📢 Sistema de Notificações - Java / Spring Boot

Este projeto é um exemplo simples usando três padrões de projeto com Java e Spring Boot:

- **Singleton** → Configurações globais da aplicação (`NotificationConfig`).
- **Strategy** → Estratégias diferentes para envio de notificações (E-mail, SMS, Push).
- **Facade** → Classe que centraliza e simplifica o envio de notificações (`NotificationFacade`).

---

## 🚀 Tecnologias
- Java 17+
- Spring Boot 3+
- Maven
- Spring Web
- Lombok (opcional)
- DevTools (opcional)

---


## ▶️ Como rodar o projeto
1. **Clonar o repositório**
```bash
git clone https://github.com/seu-usuario/sistema-notificacoes.git

cd sistema-notificacoes

mvn spring-boot:run
```

Agora testar colando no navegador http://localhost:8080/notify/sms?receiver=guilherme&msg=olá

