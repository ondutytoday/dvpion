ContactsList = new ArrayList<Contact>();
for(int i=0;i<temp.length;i+=3)
{ 
Contact C = new Contact();
if(temp.compareTo("")!=0) C.Name= new String(temp);
if(temp[i+1].compareTo("")!=0) C.Surname= new String(temp[i+1]);
if(temp[i+2].compareTo("")!=0) C.Phone= new String(temp[i+2]);
ContactsList.add(C);
}
int ind=0;
ArrayString = new String[2*ContactsList.size()];
for(int i=0;i<ContactsList.size();i++)
{
Contact C;
C=ContactsList.get(i);
ArrayString[ind]= C.Name+C.Surname;
ind++;
ArrayString[ind]= C.Phone;
ind++;
}