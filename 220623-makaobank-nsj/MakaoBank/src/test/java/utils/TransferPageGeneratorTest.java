package utils;

import models.Account;
import org.junit.jupiter.api.Test;

import javax.xml.transform.stax.StAXResult;

import static org.junit.jupiter.api.Assertions.*;

class TransferPageGeneratorTest {
  @Test
  void form() {
    Account account = new Account("1234", "ashal", 3000);

    PageGenerator pageGenerator = new TransferPageGenerator(account);

    String html = pageGenerator.html();
    assertTrue(html.contains("잔액: 3000원"), "잔액 문제 있음" + html);
    assertTrue(html.contains("보낼계좌: <input"), "보낼 계좌 문제 있음" + html);
    assertTrue(html.contains("보낼금액: <input"), "보낼 금액 문제 있음" + html);
    assertTrue(html.contains("<button"), "보낼 버튼 문제 있음" + html);
  }
}