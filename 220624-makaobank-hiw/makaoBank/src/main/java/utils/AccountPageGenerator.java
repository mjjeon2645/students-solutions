package utils;

import models.Account;

public class AccountPageGenerator extends PageGenerator {
  private final Account account;

  public AccountPageGenerator(Account account) {
    super();

    this.account = account;
  }

  public String content() {
    return
        "    <p>계좌번호: " + account.identifier() + "</p>\n" +
            "    <p>예금주명: " + account.name() + "</p>\n" +
            "    <p>잔액: " + account.amount() + "원</p>\n";
  }
}
