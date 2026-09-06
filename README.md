# Lab Task 2 — Bank Account Operations

## Objective

The objective of this lab is to test class invariants and exceptional conditions in a Java Bank Account system.

The lab focuses on testing valid account operations as well as handling invalid operations such as negative deposits and overdrafts.

## Implementation and Tasks Completed

The `BankAccount.java` class was implemented with the following operations:

- `deposit()` — Adds money to the account balance.
- `withdraw()` — Withdraws money from the account balance.
- `getBalance()` — Returns the current account balance.

The following tasks were completed:

- Tested a positive deposit of 1000.
- Tested a valid withdrawal of 300 from a balance of 1000.
- Tested overdraft by attempting to withdraw more than the available balance.
- Tested a negative deposit.
- Verified that `IllegalStateException` is thrown when an overdraft occurs.
- Verified that `IllegalArgumentException` is thrown when a negative deposit is made.
- All four test cases passed successfully.

## How to Run

### Run the Code

1. Open the project in NetBeans IDE.
2. Open `BankAccount.java`.
3. Run the Java project or class.

### Run the Tests

1. Open `BankAccountTest.java`.
2. Right-click the test file.
3. Select **Test File** to run the JUnit tests.

If the project is configured with Maven, tests can also be run using:

```bash
mvn test
