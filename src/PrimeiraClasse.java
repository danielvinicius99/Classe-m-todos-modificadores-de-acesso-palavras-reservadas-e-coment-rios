public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Olá Rodrigo");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(2);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        cliente.imprimirEndereco();


        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.valorTotal());
    }
}
