# System zarządzania biblioteką
Oprogramowanie dzięki któremu można zarządzać prostą biblioteką

## Role
 - Administrator
 - Użytkownik

## Wymagania funkcjonalne

- Administrator
    - Może dodawać/usuwać/przeglądać użytkowników
    - Może dodawać/usuwać/przeglądać książki
    - Może się wylogować
    
- Użytkownik
    - Może przeglądać książki
    - Może wypożyczyć książkę
    - Może przejrzeć książki wypożyczone
    - Może zwrócić książkę
    - Może się wylogować
    - Może wypożyczyć maksymalnie 2 książki 
    
## Technologie użyte w projekcie
- Spring Boot
- Bazadanych H2
- Spring security
- Spring MVC
- Spring data
- Podpięty system budowania (Circle-ci lub Travis-ci)
