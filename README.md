# Esercizio - Spring Boot - Repository Spring 1
* scrivere un'applicazione Spring Boot con le dipendenze necessarie che:
  * funziona sulla porta `5050`
  * utilizza `Rest Repositories HAL Explorer`
  * si connette a un db MySQL locale
  * rilascia lo schema alla fine della sessione
  * definisce una tabella di linguaggi di programmazione, dove ogni `ProgrammingLanguage` ha:
    * una chiave primaria
    * un `nome` non nullo
    * un anno di `firstAppearance` che può essere nullo
    * una colonna `inventore` non nulla
  * definisce un repository per i linguaggi di programmazione, in modo che sia possibile utilizzare `HAL Explorer` e `Postman`:
    * il repository usa un percorso specifico chiamato `repo-prog-languages` e ha una descrizione
* usa `Postino` per:
  * aggiungere 4 linguaggi di programmazione specifici al database:
    * `Java`
    * `C++`
    * `JavaScript`
    * `Vai`
  * ottenere un elenco di tutti i linguaggi di programmazione disponibili nel database, con una paginazione di 2 risultati per pagina
  * modificare l'inventore di uno dei linguaggi di programmazione già presenti nel database, inserendo il proprio nome
* **nota per i revisori**: esempi di richieste postino sono disponibili in `SpringRepositories2PostmanCollection.postman_collection.json`

# Exercise - Spring Boot - Spring Repositories 1
* write a Spring Boot application with the necessary dependencies that:
  * runs on port `5050`
  * uses `Rest Repositories HAL Explorer`
  * connects to a local MySQL db
  * drops the schema at the end of the session
  * defines a table of programming languages, where each `ProgrammingLanguage` has:
    * a primary key
    * a `name` not null
    * a year of `firstAppearance` that can be null
    * a column `inventor` not null
  * defines a repository for the programming languages, so that it's possible to use `HAL Explorer` and `Postman`:
    * the repository uses a specific path called `repo-prog-languages` and it has a description
* use `Postman` to:
  * add 4 specific programming languages to database:
    * `Java`
    * `C++`
    * `JavaScript`
    * `Go`
  * get a list of all the programming languages available in the database, with a pagination of 2 results per page
  * edit the inventor of one of the programming languages already in the database, entering your name
* **note for reviewers**: examples of postman requests can be found in `SpringRepositories2PostmanCollection.postman_collection.json`
