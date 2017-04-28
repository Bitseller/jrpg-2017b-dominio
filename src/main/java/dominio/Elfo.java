package dominio;

public class Elfo extends Personaje {
	/**
	 * La clase Elfo hereda de la clase Personaje, completa ciertos atributos que estaban declarados en
	 * la clase Personaje, como por ejemplo habilidadesRaza[]
	 * @param nombre Indica el nombre el personaje
	 * @param casta Indica la casta(Raza) del personaje
	 * @param id Identificador del personaje
	 */
	public Elfo(String nombre, Casta casta, int id) {
		super(nombre, casta, id);
		energiaTope += 10;
		salud = saludTope;
		energia = energiaTope;
		this.completarHabilidad();
	}
	/**
	 * La clase Elfo hereda de la clase Personaje, completa ciertos atributos que estaban declarados en
	 * la clase Personaje, como por ejemplo habilidadesRaza[]
	 * Recibe la mayoría de los atributos
	 * @param nombre Nombre del personaje
	 * @param salud Salud del personaje
	 * @param energia Energia del personaje
	 * @param fuerza Fuerza del Personaje
	 * @param destreza Destreza del personaje
	 * @param inteligencia Inteligencia del personaje
	 * @param casta Casta(Raza) del personaje 
	 * @param experiencia Experiencia del personaje
	 * @param nivel Nivel del personaje 
	 * @param idPersonaje Id del personaje
	 */
	public Elfo(String nombre, int salud, int energia, int fuerza, int destreza, int inteligencia, Casta casta,
			int experiencia, int nivel,
			int idPersonaje) {
		super(nombre, salud, energia, fuerza, destreza, inteligencia, casta,
				experiencia, nivel, idPersonaje);
		this.completarHabilidad();
		//habilidadesRaza = new String[2];

	}

	// Golpe Level
	/**
	 * Retorna un booleano dependiendo de si se realizó exitosamente o no el ataque.
	 * La primera condición para que el ataque pueda realizarse es que el atacante(caster) posea 10 o
	 * más del atributo energia ya que estos se descuentan seguido de comprobar que los posee, de lo contrario
	 * el ataque no será posible y se retornará false
	 * El método serAtacado() posee como argumento la suma de la fuerza del atacante y 
	 * el nivel del mismo multiplicado por 10
	 * @param atacado Instancia de Personaje o de NPC, dependiendo de cual sea, será como responda el 
	 * método serAtacado()
	 */
	public boolean habilidadRaza1(Peleable atacado) {
		if (this.getEnergia() > 10) {
			this.setEnergia(this.getEnergia() - 10);
			if (atacado.serAtacado(this.getFuerza() + this.getNivel() * 10) > 0)
				return true;
		}
		return false;
	}

	// Ataque Bosque

	/**
	 * Retorna un booleano dependiendo de si se realizó exitosamente o no el ataque.
	 * La primera condición para que el ataque pueda realizarse es que el atacante(caster) posea 10 o
	 * más del atributo energia ya que estos se descuentan seguido de comprobar que los posee, de lo contrario
	 * el ataque no será posible y se retornará false
	 * El método serAtacado() posee como argumento un entero representando 1 o 0, dependiendo si el
	 * atributo magia del llamador, es mayor a 0
	 * @param atacado Instancia de Personaje o de NPC, dependiendo de cual sea, será como responda el 
	 * método serAtacado()
	 */
	public boolean habilidadRaza2(Peleable atacado) {
		if (this.getEnergia() > 10) {
			this.setEnergia(this.getEnergia() - 10);
			if (atacado.serAtacado((int) (this.magia)) > 0)
				return true;
		}
		return false;
	}
	@Override
	public void completarHabilidad() {
		nombreRaza = "Elfo";
		habilidadesRaza[0] = "Golpe Level";
		habilidadesRaza[1] = "Ataque Bosque";
		
	}
}
