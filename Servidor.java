public class ServidorTCPBasico {
    public static void main(String[] args) {
        try {
          // Instancia o ServerSocket ouvindo a porta 12345
          Serversocket servidor = new ServerSocket(12345);
          System.out.println("Servidor ouvindo a porta 12345");
          while(true) {
            // o método accept() bloqueia a execução até que
            // o servidor receba um pedido de conexão
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
            ObjctOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
            saida.flush();
            saida.writeObject(new Date());
            saida.close();
            cliente.close();
            }
            
            }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
         }
         finally {...}
       }
     }