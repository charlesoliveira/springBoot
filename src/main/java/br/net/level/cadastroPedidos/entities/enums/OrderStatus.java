package br.net.level.cadastroPedidos.entities.enums;

public enum OrderStatus {

	WAITING_PAIMENT(1, "aguardando pagamento"),
	PAID(2, "pago"),
	SHIPPED(3, "enviado"),
	DELIVERED(4, "entregue"),
	CANCELED(5, "cancelado");
	
	private int code;
	private String description;;
	
	private OrderStatus(int code, String description) {
		this.code = code;
		this.description=description;
	}
	public int getCode() {
		return code;
	}
	public String getDescription() { return description; }
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
