1) To write to file :
	Press "i" to enter INSERT mode . Now you can write , delete , do whatever else .

2) To close or exit Vim ( Many people find this difficult , I don't know why )
	Press Esc to exit the INSERT mode . Then either 
		1) Type ":q!" to exit vim without saving changes .
		2) Type ":wq" to save the changes and exit vim .	

3) To undo all changes made in current session 
	Press Esc to exit INSERT mode .
	Then type ":e!" followed by Enter key 

4) Copy/Cut paste
	Select => Press v to enter visual mode . Move curser around to select text.
	Copy   => Then  y to yank (copy) it .
	Cut    => Press d
	Paste  => Press p


5) Go back to previous location  => Ctrl + O
   Jump forward to next location => Ctrl + I

6) Set line number 	    	=> set nu
   Set relative line number 	=> set rnu
   Disable line number      	=> set nu!
   Disable relative line number => set nornu
