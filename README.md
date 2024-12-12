איך להפעיל את התוכנית
לקמפל את התוכנית:

ודא שהקבצים Ex1Main.java ו-Ex1.java נמצאים בתיקייה assignments/ex1 (או באותה חבילה).
השתמש בפקודה הבאה כדי לקמפל:
bash
Copy code
javac assignments/ex1/Ex1Main.java assignments/ex1/Ex1.java
להריץ את התוכנית:

לאחר הקימפול, הרץ את התוכנית באמצעות הפקודה:
bash
Copy code
java assignments.ex1.Ex1Main
להזין נתונים:

הזן מחרוזות מספריות כשמתבקש (או כתוב quit כדי לצאת).
הזן בסיס חוקי (מספר בין 2 ל-16) כדי להציג את התוצאות.
איך התוכנית עובדת
התוכנית מבקשת מהמשתמש להזין שני מספרים כמחרוזות.
התוכנית בודקת אם כל אחת מהמחרוזות היא מספר חוקי באמצעות הפונקציה Ex1.isNumber.
אם המספרים חוקיים, התוכנית ממירה את המחרוזות למספרים שלמים באמצעות Ex1.number2Int.
המשתמש מתבקש להזין בסיס להצגת התוצאות (בין 2 ל-16).
התוכנית מחשבת את סכום והכפלת שני המספרים.
התוצאות (סכום וכפל) מומרות לבסיס המבוקש באמצעות Ex1.int2Number.
התוכנית מוצאת את המספר הגדול ביותר בין שני המספרים, הסכום, והמכפלה.
התוצאות מוצגות למשתמש.
דוגמה להרצה
קלט:
plaintext
Copy code
Ex1 class solution:
Enter a string as number#1 (or "quit" to end the program):
101

num1= 101 is number: true, value: 101
Enter a string as number#2 (or "quit" to end the program):
5

num2= 5 is number: true, value: 5
Enter a base for output: (a number [2,16])
2
פלט:
plaintext
Copy code
101 + 5 = 110
101 * 5 = 1111101
Max number over [101,5,110,1111101] is: 1111101
