package br.com.devmedia.patherns.factory_method;

public class HtmlButton implements Button
{
    @Override
    public void render() {
        System.out.println("<button>Test pattern.factory_method.Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! O botão disse - 'Hello World!'");
    }
}
