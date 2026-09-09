# TP1 — Spring Boot API REST

---

## 1. Setup del proyecto

- [x] ~~Crear proyecto con Spring Initializr~~
  - [x] ~~Java 25~~
  - [x] ~~Maven~~
  - [x] ~~Spring Boot 4.1.x~~
- [x] ~~Agregar `spring-boot-starter-webmvc`~~
- [x] ~~Agregar `spring-boot-starter-validation`~~
- [x] ~~Agregar `springdoc-openapi-starter-webmvc-ui`~~
- [x] ~~Verificar que el proyecto levanta correctamente~~
- [x] ~~Crear endpoint de prueba~~
- [x] ~~Verificar que responde correctamente~~

---

## 2. Catálogo de productos

### Consumo de API externa

- [ ] Investigar `RestClient`
- [ ] Evaluar `WebClient` como alternativa
- [ ] Consumir DummyJSON
- [ ] Probar `GET https://dummyjson.com/products`

### DTO

- [ ] Crear DTO propio para Producto
- [ ] Elegir qué campos exponer
- [ ] Evitar exponer directamente el JSON de DummyJSON
- [ ] Mapear respuesta externa → DTO propio

### Endpoints

- [ ] `GET /api/productos`
  - [ ] Responde correctamente
  - [ ] Devuelve lista de DTOs
- [ ] `GET /api/productos/{id}`
  - [ ] Responde correctamente
  - [ ] Maneja producto inexistente

### Paginación — opcional

- [ ] Diseñar contrato propio de paginación
- [ ] Evaluar `limit` / `skip`
- [ ] Transformar parámetros de DummyJSON si corresponde

---

## 3. Favoritos — Dominio + Repository

### Entidad

- [ ] Crear entidad de dominio `Favorito`
- [ ] Definir `id`
- [ ] Definir referencia al producto externo
- [ ] Definir nota personal
- [ ] Definir fecha de agregado

### Repository

- [ ] Crear interfaz `FavoritoRepository`
- [ ] Crear implementación en memoria
- [ ] Utilizar una colección
- [ ] No utilizar JPA
- [ ] Implementar operaciones necesarias para el CRUD

---

## 4. DTOs de favoritos

- [ ] Crear DTO de entrada
- [ ] Crear DTO de salida
- [ ] Definir campos del DTO de entrada
- [ ] Definir campos del DTO de salida
- [ ] Mapear DTO entrada → entidad
- [ ] Mapear entidad → DTO salida

---

## 5. Controller de favoritos — CRUD

### POST

- [ ] `POST /api/favoritos`
- [ ] Crear favorito
- [ ] Responder `201 Created`

### GET — lista

- [ ] `GET /api/favoritos`
- [ ] Responder `200 OK`

### GET — uno

- [ ] `GET /api/favoritos/{id}`
- [ ] Responder `200 OK`
- [ ] Manejar favorito inexistente

### PUT

- [ ] `PUT /api/favoritos/{id}`
- [ ] Actualizar favorito
- [ ] Responder `200 OK`
- [ ] Manejar favorito inexistente

### DELETE

- [ ] `DELETE /api/favoritos/{id}`
- [ ] Eliminar favorito
- [ ] Responder `204 No Content`
- [ ] Manejar favorito inexistente

---

## 6. Validación

- [ ] Agregar Bean Validation
- [ ] Validar DTO de entrada
- [ ] Usar `@NotNull`
- [ ] Usar `@NotBlank`
- [ ] Agregar otras validaciones necesarias
- [ ] Probar request inválido
- [ ] Responder `400 Bad Request`
- [ ] Informar qué campo falló
- [ ] Informar por qué falló

---

## 7. Manejo uniforme de errores

### ControllerAdvice

- [ ] Crear `@ControllerAdvice`
- [ ] Definir formato de respuesta de error
- [ ] Mantener respuesta consistente

### Errores

- [ ] Favorito inexistente → `404 Not Found`
- [ ] Validación fallida → `400 Bad Request`
- [ ] Error de API externa → código `5xx`
- [ ] Timeout de API externa → código `5xx`
- [ ] Verificar que todos devuelvan el formato uniforme

---

## 8. Documentación

- [ ] Integrar springdoc-openapi
- [ ] Abrir Swagger UI
- [ ] Verificar endpoints de productos
- [ ] Verificar endpoints de favoritos
- [ ] Agregar `@Operation` a los endpoints
- [ ] Agregar al menos una descripción por endpoint
- [ ] Probar endpoints desde Swagger

---

# 🧪 Pruebas finales

## Productos

- [ ] GET todos los productos
- [ ] GET producto existente
- [ ] GET producto inexistente
- [ ] Probar caída/error de DummyJSON

## Favoritos

- [ ] POST válido
- [ ] POST inválido
- [ ] GET todos
- [ ] GET existente
- [ ] GET inexistente
- [ ] PUT válido
- [ ] PUT inexistente
- [ ] DELETE existente
- [ ] DELETE inexistente

## HTTP

- [ ] Revisar códigos `200`
- [ ] Revisar `201`
- [ ] Revisar `204`
- [ ] Revisar `400`
- [ ] Revisar `404`
- [ ] Revisar `5xx`

## Arquitectura

- [ ] Controller
- [ ] Service
- [ ] Repository
- [ ] DTO
- [ ] Entity/dominio
- [ ] Cliente de API externa
- [ ] Manejo centralizado de excepciones

## Entrega

- [ ] Código compila
- [ ] Proyecto inicia
- [ ] No hay errores en consola
- [ ] Swagger funciona
- [ ] README actualizado
- [ ] Git commit realizado
- [ ] Push realizado
- [ ] Repositorio listo para entregar