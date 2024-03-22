package aula2103;

public class ExibindoInvoice {
    public static void main(String[] args) {

        Suprimentos s1 = new Suprimentos(1, "descricao 1", 2, 2.00);
        System.out.println("\n[Suprimentos 1] ");
        System.out.println("numero faturamento: "+s1.getNumeroFaturamento());
        System.out.println("descrição: "+s1.getDescricao());
        System.out.println("qtd comprada: "+s1.getQuantidadeComprada());
        System.out.println("preço: R$ "+s1.getPreco());
        System.out.println("O total da fatura 1 é: R$ "+s1.getInvoiceAmount());;

        //mostrando que a lógica de zerar quando for preço negativo funciona
        Suprimentos s2 = new Suprimentos(2, "descricao 2", 1, -2.00);
        System.out.println("\n[Suprimentos 2] ");
        System.out.println("numero faturamento: "+s2.getNumeroFaturamento());
        System.out.println("descrição: "+s2.getDescricao());
        System.out.println("qtd comprada: "+s2.getQuantidadeComprada());
        System.out.println("preço: R$ "+s2.getPreco());
        System.out.println("O total da fatura 2 é: R$ "+s2.getInvoiceAmount());

        //mostrando que a lógica de zerar quando for quantidade negativa funciona
        Suprimentos s3 = new Suprimentos(3, "descricao 3", -4, 5.00);
        System.out.println("\n[Suprimentos 3] ");
        System.out.println("numero faturamento: "+s3.getNumeroFaturamento());
        System.out.println("descrição: "+s3.getDescricao());
        System.out.println("qtd comprada: "+s3.getQuantidadeComprada());
        System.out.println("preço: R$ "+s3.getPreco());
        System.out.println("O total da fatura 3 é: R$ "+s3.getInvoiceAmount());
    }
}
