# Uppgift2MVC


Försöker hålla mig strikt till MVC och delar hellre upp klasser och servlets mer än nödvändigt för att nöta in designen. Använder mig av 2 controllers, 2 Beans och en model som jag kallar ListHandler. Controllers skickar vidare beroende på vad som kommer in genom HTML-formulären. ListHandler tar hand om registreringen och sökandet av redan registrerade kunder. Beans tar hand om informationen som controllern skickar och är det objekt som skickas runt och kollas av både controllern och av model. 
Om man inte är registrerad, så skickas man till Register.jsp när man försöker logga in. Där registreras man och läggs in i en lista som hanteras av ListHandler. Man får ett välkomstmeddelande och så presenteras ens stad och ålder. Sessionen visas också på denna sida. När man trycker på logga ut så förs man vidare till loginsidan igen. Därifrån kan man logga in igen med sitt username och password.
