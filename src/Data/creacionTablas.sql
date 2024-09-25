-- Crear la tabla Persona
CREATE TABLE Persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    tipo VARCHAR(50) NOT NULL
);

-- Crear la tabla Usuario
CREATE TABLE Usuario (
    id INT PRIMARY KEY,
    prestamos INT NOT NULL,
    FOREIGN KEY (id) REFERENCES Persona(id)
);

-- Crear la tabla Bibliotecario
CREATE TABLE Bibliotecario (
    id INT PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES Persona(id)
);

-- Crear la tabla Libro
CREATE TABLE Libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) NOT NULL UNIQUE,
    disponible BOOLEAN DEFAULT TRUE
);

-- Crear la tabla Prestamo
CREATE TABLE Prestamo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    libro_id INT,
    usuario_id INT,
    fecha_prestamo DATE NOT NULL,
    fecha_devolucion DATE,
    FOREIGN KEY (libro_id) REFERENCES Libro(id),
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);

-- Registro para persona
insert into Persona (id, nombre, apellido, tipo) values
(1, 'Maria', 'Pérez', 'usuario'),
(2, 'Amparo', 'Gómez', 'usuario'),
(3, 'Lucca', 'Hernandez', 'usuario'),
(4, 'Yessica', 'Osa', 'usuario'),
(5, 'Fernando', 'López', 'usuario'),
(6, 'Daniela', 'Martínez', 'bibliotecario'),
(7, 'Amelia', 'González', 'bibliotecario'),
(8, 'Johan', 'Amariles', 'bibliotecario'),
(9, 'Conrado', 'Herrera', 'bibliotecario'),
(10, 'Ana', 'Bravo', 'bibliotecario'),


-- Registros para tabla libros
insert into libros (id, titulo, autor, isbn, disponible) values
(1, 'Rebelión en la granja', 'George Orwell', '3658479', true),
(2, 'La ladrona de libros', 'Markus Zusak', '5698745', true),
(3, 'Los juegos del hambre', 'Suzanne Collins', '8965874', true),
(4, 'El señor de las moscas', 'William Golding', '3698796', true),
(5, 'Los miserables', 'Victor Hugo', '31254789', true),

-- Registros para tabla usuarios
insert into usuarios (id, prestamos) values
(1, 2),
(2, 1),
(3, 1),
(4, 3),
(5, 2);

-- Registro para bibliotecario
insert into Bibliotecario (id) values
(6),
(7),
(8),
(9),
(10);






