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