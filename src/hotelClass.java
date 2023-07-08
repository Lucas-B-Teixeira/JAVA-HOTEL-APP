public class hotelClass {

    public static class quarto{
        private String numero;
        private double preco;
        private boolean disponibilidade;

        public quarto(String numero, double preco, boolean disponibilidade){
            this.numero = numero;
            this.preco = preco;
            this.disponibilidade = disponibilidade;
        };

        public String getNumero(){
            return numero;
        }

        public boolean getDispo(){
            return disponibilidade;
        }

        public String getInfo(){
            String dispo;

            if (disponibilidade){
                dispo = "Sim";
            }else{
                dispo = "Não";
            }

            return "Numero: " + numero + ", Preço: " + preco + ", Disponivel: " + dispo;
        }

        public void setDispo(boolean dispo){
            this.disponibilidade = dispo;
        }
    }

    public static class usuario{
        private String nome;
        private String endereco;

        public usuario(String nome, String endereco){
            this.nome = nome;
            this.endereco = endereco;
        }

        public String getAll(){ return "Nome: " + nome + ", Endereço: " + endereco;};

    }

    public static class reserva{
        private String numero;
        private String usrName;
        private String dataReserva;
        private String dataChecking;
        private String dataCheckout;

        public reserva(String numQua, String usrName, String dataReserva, String dataChecking, String dataCheckout ){
            this.numero = numQua;
            this.usrName = usrName;
            this.dataReserva = dataReserva;
            this.dataChecking = dataChecking;
            this.dataCheckout = dataCheckout;
        }

        public String getNum(){ return numero; }

        public String getAll(){
            return "\nNúmero do quarto reservado: " + numero +
                    "\nNome da pessoas que reservou o quarto: " + usrName +
                    "\nData da reserva: " + dataReserva +
                    "\nData do check-in: " + dataChecking +
                    "\nData do check-out: " + dataCheckout;
        }

        public void setDataReserva(String dataReserva){
            this.dataReserva = dataReserva;
        }

        public void setDataCheckin(String dataCheckin){
            this.dataChecking = dataCheckin;
        }

        public void setDataCheckout(String dataCheckout){
            this.dataCheckout = dataCheckout;
        }
    }
}
