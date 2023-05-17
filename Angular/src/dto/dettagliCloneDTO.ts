import { UtenteDTO } from "./utenteDTO";

export class DettagliCloneDTO{
    id: number | undefined;
    utenteDTO: UtenteDTO | undefined;
    nome: string | undefined;
    cognome: string | undefined;
    sesso: string | undefined;
    altezza: number | undefined;
    peso: number | undefined;
    nazionalita: string | undefined;
}