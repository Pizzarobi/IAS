# 7. Umweltmodellierung
Repräsentation des Wissens über die Umwelt im Local Perceptual Space (LPS)

# 7.1 Kartographie
Zunächst Kartenbildung mit Laserscans. Später Erweiterung um Bildinformationen. <br>
Im ersten Schritt: Filterung der Laserdaten<br>
## Medianfilter
Ersetzung Ausreißer im Scan durch geeignete Messwerte. Legen Fenster um Ausreißer. Ersetzung  Ausreißer durch Median im Fenster

### Beispiel:
Laserscan: ... 1,0 ~1,2 1,3 *2,2* 1,4 1,4~ 1,5 ... <br>
2.2 ist ausreißer. Bildung des Fensters mit größe 5. Ersetzen 2,2 mit Median = 1,4.

## Reduktionsfilter
Sukzessive Zusammenfassung von Punktwolken zu einem Punkt (Schwerpunkt) im Kreis um nächstgelegenen Punkt. <br>

### Fusion der Datenströme
- Kalman-Filter (-> Signalverarbeitung)
- Ocupancy-Grid (-> hier)

## Occupancy-Grid
Segmentierung Umfeld in Gitter, Eintragung Sensormesswerte in Gitterzellen, bei hinreichen viele Eintragungen in einer Zelle wird Zelle als belegt markiert. Größe Gitterzellen frei wählbar und richtet sich nach Größe zu erwartender Umfeldobjekte. <br>

### Beispiel:
Fahrzeug mit zwei Entfernungsensoren, Kreisförmiger Gitter mit Zunahme Gitterradien<br>
Bei exakten Sensoren hinreichen wenn ein Sensor Belegung erkennt. Bei unsicheren Sensoren werden Unsicherheiten in den MEsswerten durch Wahrscheinlichkeiten ausgedrückt.<br>
Berechnung Belegheitswahrscheinlichkeit über Evidenztheorie (Dempster-Shafer-Theorie): Verallgemeinerung Satz von Bayes. <br>
Geg: Menge sich gegenseitig ausschließender Ereignisse *theta* (Wahrnehmungsrahmen)<br>

### Massefunktion m: 
2^n -> [0,1]  mit m (theta) = 0 und SUM(x e 2^n) m(x) = 1 <br> 
ordnet jedem Eregnis eine Wahrscheinlichkeit zu. <br>

Kombinationsregel (+): <br>
m1⊕ m2 (x): ja muss ich jemanden fragen kb abzuzeichnen etz.

⊕ ist Kommutativ und Assoziativ<br>
Anpassung ⊕ auf Datenfusion mit zwei Sensoren<br>
⊖ = {B,B'} mit B und B Zelle belegt erkannt und B' Zelle frei erkannt<br>
2⊕ = {∅,{B},{B'},⊖} <br>
m1⊕m2 (B) := m1(B) m2(B) + m1(⊖)m2(B) + m1(B)m2(⊖) / 1 - m1(B')m2(B) - m2(B')m1(B) <br>
m(⊖): Unschlüssigkeit Belegungsmessung bei exakten Sensoren 0 <br>

<u>Gegeben:</u> Messungen von Radar & Laserscanner bezogen auf eine Gitterzelle.

m radar (B) = 0,6 &emsp; m laser (B) = 0,7 <br>
m radar (θ) = 0,2 &emsp; m laser (θ) = 0,1 <br>
&emsp; ^ unschlüssigkeit (Sensor ist sich nicht sicher) <br>


## Ich glaub hier fehlt was

## Beispiel, Fahrzeugklassen


# 7.2 Selbstlokalisation
Ziel: Bestimmung Fahrzeugposition in Karte anhand aktueller Sensordaten <br>
Hier: Laserscanner als Sensor (SLAM) <br>
Formale Aufgabe: Geg: Scan t (Referenzscan der Karte) <br>
&emsp; &emsp; Scan s (Aktuell aufgenommener Scan) <br>
&emsp; &emsp; Geg: l Lokalität des Fahrzeugs in der Karte <br>
&emsp; &emsp; &emsp; match(l) -> p (l) e [0,1] <br>
&emsp; &emsp; &emsp; p(l) ist umso größer, je besser sich s mit t nach bester Verschiebung und Drehung überdeckt <br>
Die Berechnung von match ist ein Suchproblem im mehrdimensionalen Raum. <br>
Vereinfachung Suchproblem durch Annahmen<br>
* Gauß -Verteilung <br>
&emsp; Approximation durch Gauß-Funktion, Verwendung von Erwartungswert und Varianz
* Lokalitätsannahme<br>
&emsp; Ungefähre von s im Koordinatensystem von t, z.B. durch GNSS oder Odometriedaten

Damit scan-match als neue Funktion mit <br>
&emsp; scan-match (s,t) = (µ match, ∑ match) mit µ match = (1x1y1⊖)⁻¹ Erwartungswert => Lokalität des Fahrzeug<br>
&emsp; &emsp; ∑ match = (crazy Matrix) => Genauigkeit der Lokalität

## Beispiel:
Gängiger Algorithmus: <br>
Markov-Lokalisation:<br>
1. Vorhersage von l unter Verwendung von Odometriedaten (ungenau Position)
1. Vorhersage von l mit scan-match
1. Beschleunigung, Berechnung scan-match  durch rekursive Anwendung Partikalfilter -> Laborübung

