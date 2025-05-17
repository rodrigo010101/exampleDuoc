# Respaldo
Clase que representa una entidad del dominio

# Anotacion JPA
@Entity
@Table(name = "Respaldo")

# para identificar primario 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
