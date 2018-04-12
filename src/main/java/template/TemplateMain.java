package template;

public class TemplateMain {
    public static void main(String[] args) {
      Car carFast = new Ferrari();
      Car carSlow = new Fiat();

      carFast.start();
      carSlow.start();
    }
}
