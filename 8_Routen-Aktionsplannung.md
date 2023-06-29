# 8 Routen - / Aktionsplannung
Aufgabe: Geg: Startposition, i.d.R. aktuelle Fahrzeugposition und Zielposition in Karte <br>
&emsp; Ges: Folge von Aktionen, die das Fahrzeug kollisionsfrei vom Start zum Ziel bewegt. <br>
Unterscheidung: 
- Makronavigation: Graphensuche (z.B. Straßen aus Karten als Knoten und Kanten)
- Mikronavigation: Potenzialfeldmethode (in kleinen "Räumen" / sliding um Hindernisse rum)

##  Potenzialfeldmethode
Lage des zylindrischen Roboters soll hier durch Konfiguration p(x,y) beschreibbar sein. (Drehung auf der Stelle möglich). Kraft auf den Roboter ist der Gradient des Porentzialfelds.<br>
F(p) = - ▽ U(p) = (Gu/Gx Gu/Gy) <br>
Fahrzeug bewegt sich nach der Methode ses steilsten Abstiegs zum Ziel. Ziel hat das anziehende Potenzial. Größtmöglicher Abstand zu Hindernissen durch abstoßendes Potenzial um die Hindernisse herum. <br>