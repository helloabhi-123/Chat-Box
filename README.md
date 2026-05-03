Chat-Box Project

# 🚀 ChatGPT Full Stack Application

This project is a full-stack chatbot application built using Spring Boot (Backend) and React (Frontend). It allows users to interact with an AI-powered chatbot through a simple and responsive interface.

---

## 📌 Features

- Real-time chatbot interaction  
- REST API built with Spring Boot  
- Responsive UI using React and Bootstrap  
- Secure API integration using environment variables  
- Deployment-ready (Render / OpenAI integration)

---

## 🛠️ Tech Stack

**Backend**
- Java  
- Spring Boot  

**Frontend**
- React.js  
- Bootstrap  

**External Services**
- OpenAI API / OpenRouter  
- Render (Deployment)

---

## 🔒 Security Improvements

Sensitive data has been removed from the project to ensure security.

- Removed exposed API keys from configuration files  
- Refactored API integration to use environment variables  
- Updated backend configuration to connect securely with external services  
- Reorganized project structure for proper API handling and fetching  

---

## ⚙️ Setup Instructions

### 1. Clone Repository
git clone https://github.com/your-username/your-repo-name.git  
cd your-repo-name

---

### 2. Backend Setup (Spring Boot)

Add your API key as an environment variable:

OPENAI_API_KEY=your_api_key_here

Run the backend:
mvn spring-boot:run

---

### 3. Frontend Setup (React)

cd frontend  
npm install  
npm start

---

## 🌍 Deployment

- Render (Backend)  
- Netlify / Vercel (Frontend)  

Make sure to configure environment variables in your deployment platform.

---

## 📂 Project Structure

project-root/
│
├── backend/  
├── frontend/  
├── README.md  
└── .gitignore  

---

## ⚠️ Important Notes

- Do not upload API keys to GitHub  
- Always use environment variables  
- Add .env to .gitignore  

---

## 🤝 Contributing

Contributions are welcome. Feel free to fork and submit pull requests.

---

## 📜 License

This project is open-source and available under the MIT License.
