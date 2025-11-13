# 🧩 GS 2º Semestre – Work Life Balance API

API REST em **Spring Boot** com o objetivo de oferecer uma base para sistemas que ajudem pessoas a equilibrar a rotina de trabalho e vida pessoal, promovendo **bem-estar**, **produtividade** e **gestão de tempo saudável**.

---

## 👥 Desenvolvido por
* **Pedro Cavariani** | RM 551380  
* **Paulo Henrique Lima** | RM 552444

---

## 🎯 Tema
**Aplicativos para conciliar vida pessoal e profissional**

---

## ⚙️ Pré-requisitos
* **Java 17** ou superior  
* **Maven 3** ou superior  
* **Docker** 

---

## 🚀 Executando

### 🐳 Via Docker

1. **Build da imagem:**

docker build -t gs-4-worklife-balance .

2. **Rodar o container:**

docker run -d --name gs4-api -p 8081:8081 gs-4-worklife-balance

3. **Acessar no navegador:**
[http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)

**📦 Imagem no Docker Hub:**  
[https://hub.docker.com/r/paulo20lima/gs-4-worklife-balance](https://hub.docker.com/r/paulo20lima/gs-4-worklife-balance)

---

## 🔁 Workflows CI/CD

### ⚙️ Continuous Integration (CI)
- Disparado em **push** nas branches: `feature/**`, `release`, `hotfix`
- Executa automaticamente:
  - Build do projeto  
  - Testes unitários  
  - Verificação do build Docker

### 🚀 Continuous Delivery (CD)
- Disparado em **pull request** para a branch `develop`
- Executa:
  - Build da imagem Docker  
  - Login automático no Docker Hub  
  - Publicação da imagem atualizada

### 🏷️ Versionamento Automático (Versioning)
- Disparado em **push** na branch `main`
- Cria automaticamente:
  - Tag de versão (`v1.X`)  
  - Release no GitHub com descrição automática

---

## 🧾 Observações
- Os **testes** e **logs** de execução dos workflows podem ser acompanhados na aba **“Actions”** do repositório GitHub.  
- Cada etapa (**CI**, **CD** e **Versioning**) é registrada automaticamente com status de **sucesso**, **falha** ou **em execução**.
<img width="1893" height="613" alt="image" src="https://github.com/user-attachments/assets/278c0497-8dcd-46f5-b3d6-2f794270030f" />

---

## 🔗 Endpoint principal

### **GET /info**
Retorna as informações do grupo e descrição do tema.

#### 📦 Exemplo de resposta:
```json
{
  "tema": "Aplicativos para conciliar vida pessoal e profissional",
  "membro1": "Pedro Cavariani - RM 551380",
  "membro2": "Paulo Henrique Lima - RM 552444",
  "descricao": "Esta API propõe soluções para equilibrar a rotina de trabalho e vida pessoal, oferecendo ferramentas para gestão de tempo, bem-estar e produtividade saudável."
}

