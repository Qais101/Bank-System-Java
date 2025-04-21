# 🏦 Java Bank Account System

A simple **command-line banking application** in Java that allows users to create an account, set a PIN, and securely perform banking operations like deposit, withdrawal, and balance checks.

---

## 📂 Project Structure

- `MainTest.java`: Handles user interaction, account setup, PIN verification, and menu-driven operations.
- `BankAccount.java`: Contains the account logic (deposit, withdraw, display info).

---

## 🧠 Features

- Create a new bank account with name, number, and initial balance.
- Set and verify a secure 4-digit PIN.
- Secure login with 3 attempts to enter the correct PIN.
- Deposit and withdraw money with limits and validations.
- Display current balance and full account information.
- Handles invalid inputs and provides helpful feedback.

---

## 🛠️ How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/java-bank-system.git
   cd java-bank-system
Compile and run the code:   
javac MainTest.java BankAccount.java
java MainTest

##Sample Output 📸
Enter holder name : John Doe
Enter account number : 123456
Enter initial balance : 5000
Set a 4-digit PIN for your account : ****
Enter 4-Digits PIN : ****
Access granted, Welcome John Doe!

---menu---
1.Deposit
2.Withdraw
3.Show Balance
4.Show Account Info
5.Exit
Enter Your Choice :


✅ Future Improvements (Optional Ideas)
Add file/database storage to save account details.

Add support for multiple accounts.

Improve error handling and input validation.

Build a GUI using JavaFX or Swing.

📄 License
This project is licensed under the MIT License.
