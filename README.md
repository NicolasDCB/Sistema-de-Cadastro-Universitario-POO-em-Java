# 🎓 Sistema de Cadastro Universitário - POO em Java

Este repositório contém a implementação de um sistema acadêmico orientado a objetos, desenvolvido como **trabalho prático da disciplina de Programação Orientada a Objetos (POO)**.

O objetivo do sistema é simular parte do gerenciamento de uma universidade, incluindo departamentos e funcionários, com uso de **herança, polimorfismo, abstração e separação em camadas**.

---

## 📋 Especificações do Projeto

O sistema modela os seguintes elementos:

- **Universidade** com múltiplos **Departamentos**
- **Departamentos** compostos por **Funcionários**, que podem ser:
  - Técnicos
  - Docentes Efetivos
  - Docentes Substitutos

Cada tipo de funcionário possui regras específicas de cálculo de salário, baseadas em:
- Nível do cargo (T1, T2, D1, D2, D3, S1, S2)
- Categoria
- Outros dados específicos como titulação, área, função ou carga horária

---

## 📊 Funcionalidades

- [x] Cadastro de departamentos e funcionários
- [x] Relatório geral de todos os departamentos com gastos
- [x] Resumo por departamento com número de funcionários e custo total
- [x] Filtro de departamentos por faixa de gasto
- [x] Filtro de funcionários por faixa salarial
- [x] Relatórios específicos:
  - Todos os funcionários
  - Apenas técnicos
  - Apenas docentes (efetivos e substitutos)
  - Apenas docentes efetivos
  - Apenas docentes substitutos
- [x] Consulta de funcionário por **nome** ou **código**
- [x] Consulta de um departamento completo por código

---

## 🧱 Estrutura do Projeto

O sistema foi implementado com **separação em camadas**:

- `modelo/` — Classes de domínio como `Funcionario`, `Tecnico`, `Docente`, etc.
- `controlador/` — Lógica de aplicação, operações de controle
- `dados/` — Armazenamento em memória (sem banco de dados)
- `visao/` — Interface grafica interativa

---

## 💼 Regras de Negócio (salário)

Tabela de adicionais:

| Categoria           | Nível | Adicional (%) |
|---------------------|--------|----------------|
| Técnico             | T1     | 10%            |
| Técnico             | T2     | 20%            |
| Docente Efetivo     | D1     | 5%             |
| Docente Efetivo     | D2     | 10%            |
| Docente Efetivo     | D3     | 20% (+5% fixo) |
| Docente Substituto  | S1     | 5%             |
| Docente Substituto  | S2     | 10%            |

---

## 🛠️ Execução do Projeto

### ✅ Pré-requisitos
- JDK 8 ou superior
- IDE como Eclipse, IntelliJ ou VS Code com extensão Java

### ▶️ Como rodar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/trabalho-poo-universidade.git
cd trabalho-poo-universidade

