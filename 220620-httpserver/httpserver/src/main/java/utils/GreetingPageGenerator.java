package utils;

public class GreetingPageGenerator extends PageGenerator{

  private String name;

  public GreetingPageGenerator(String name) {
    if (name.isBlank()) {
      this.name = "world";
      return;
    }

    this.name = name;
  }

  public GreetingPageGenerator() {
    this.name = "world";
  }

  public String text() {
    return "Hello , " + name + "!";
  }

  @Override
  public String html() {
    return null;
  }
}
