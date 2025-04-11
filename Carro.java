class Carro{
    private String marca;
    private String modelo;
    private String placa;
    private Motor motor;
    private Condutor condutor;

    public Carro(String marca,String modelo,String placa, String tipoMotor, Integer potenciaMotor, String nomeCondutor, Integer cnhCondutor){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = new Motor(tipoMotor, potenciaMotor);
        this.condutor = new Condutor(nomeCondutor, cnhCondutor);
    }
}