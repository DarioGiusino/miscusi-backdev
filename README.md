# miscusi-backdev
Questo repository contiene un sistema di gestione ristorante implementato in Java utilizzando il framework Spring Boot. Il sistema copre la creazione del menu, la gestione dei prodotti e l'elaborazione degli ordini.

Classe Principale dell'Applicazione: BackDevApplication
Punto di ingresso dell'applicazione Spring Boot.
Inizializza dati di esempio all'avvio dell'applicazione utilizzando l'interfaccia CommandLineRunner.
Dimostra l'utilizzo dei servizi MenuServ e ProductServ.

Controller REST API: MenuApiController
Gestisce i punti finali REST per le operazioni legate al menu.
Fornisce punti finali per la creazione e l'aggiornamento degli elementi del menu.
Utilizza MenuServ per la logica di business.

Configurazione della Sicurezza: AuthConfiguration
Configura la sicurezza di Spring per l'applicazione.
Disabilita la protezione CSRF per semplicità.
Permette tutte le richieste per scopi dimostrativi.

Configurazione del Logging: LoggerConfiguration
Configura un logger globale per l'applicazione.
Registra le informazioni su un file chiamato global-logs.log.

Componente di Pulizia del Logger: LoggerCleanup
Utilizzato per pulire le risorse associate al logger globale.
Chiude tutti gli handler del logger globale allo spegnimento dell'applicazione.

Classi Entità: Ingredient, Menu, OrderEntity, Product
Rappresentano le entità dati principali dell'applicazione.
Stabiliscono relazioni tra entità utilizzando annotazioni JPA.
Utilizzano relazioni bidirezionali per navigare tra entità correlate.

Interfacce Repository: IngredientRepo, MenuRepo, OrderRepo, ProductRepo
Estendono JpaRepository per eseguire operazioni CRUD sulle entità.
Forniscono funzionalità di accesso di base per le rispettive entità.

Classi di Servizio: IngredientServ, MenuServ, OrderServ, ProductServ
Implementano la logica di business per le rispettive entità.
Utilizzano interfacce di repository per l'accesso ai dati.
Espongono metodi per eseguire operazioni CRUD sulle entità.

Configurazione del Database: application.properties
Configura i dettagli di connessione al database MySQL.
Specifica ad Hibernate di generare tabelle all'avvio dell'applicazione per semplicità.

File SQL di Dati di Esempio: data.sql
Contiene istruzioni SQL per inserire dati di esempio nel database.

Questo sistema di gestione ristorante funge da base per la creazione di applicazioni più sofisticate. Include funzionalità come la creazione del menu, la gestione dei prodotti e l'elaborazione degli ordini. Il sistema è integrato con Spring Security per l'autenticazione e l'autorizzazione di base.
