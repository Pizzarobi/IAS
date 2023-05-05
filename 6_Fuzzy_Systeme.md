# 6. Fuzzy Systeme
# 6.1 Fuzzy Logic
## (Scharfe) Menge
Geg: Grundmenge G <br>
&emsp; Menge M c G durch Zugehörigkeitensfunktion<br>
&emsp; V x E G: M(x)
## unscharfe Menge (Fuzzy Set)

Alles mögliche an Mathe shit

##

# Min Max Methode
Zyklische Ausführung folgender Schritte
- Umwandlung, Sensordaten in unscharfe Zahlen gemäß Sensorqualität
- Prüfung Bedingungen der Regeln. Ausfürhung der Aktionen entsprechend dem Erfüllungsgrad der Regelbedingung. Erfüllungsgrad entspricht Höhe des Fuzzy Sets aus der Überlappung der Fuzzy Set von linguistischer Variable und unscharfer Messwert
- Verknüpfung Hohen Einzelbedingun gemäß Logikoperator
- Reduktion Fuzzy Sets der Aktionen entsprechend Verknüpfungergebnis
- Vereinigung der reduzierten Fuzzy Sets zu je einem Fuzzy Set für jede Stellgröße
- Transformation der reduzierten Fuzzy Sets der Stellgrößen zu einem Konktreten Stellwert für jede Größe
- Asuwahl absolutes Maximum, z.B. von links nach rechts (Sicherheitsstellung)
- Bildung Mittelwert aller Maxima
- Schwerpunktbildung xres = M/F, Moment M = ymax SUM xmin x*f(x)dx, Fläche F = ymax SUM xmin f(x)dx

## Beispiel: Handout für 230 mm/s und 80 cm

Abstand:

Beschleunigung &emsp;&emsp;&emsp; geschwindigkeit
|  | unzuverlässig | schnell | mittel | langsam
| --- | --- | --- | --- | --- |
weit | bremsen | unverändert | schneller | schneller
nah | bremsen | langsamer | unverändert | unverändert
kritisch | bremsen | bremsen | bremsen | bremsen