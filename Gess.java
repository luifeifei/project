public class Gess
{
	public static void main (String [] args){
		char word = 'd' ,word1 = '@';
		int p = 23045,p1 = 4513;
	
		System.out.println("���\t�ٶ�");
		System.out.println("��unicode���\nλ����"+(int) word);
		System.out.println("\"d��unicode���λ��:\"" + (int) word1);
		System.out.println("d��unicode���λ��:" + (char) p);
		System.out.println("d��unicode��λ��"+ (char) p1);
		Opint a = new Opint();
		a.one();
	}
}

class Opint
{ 
	public void one() {
		System.out.println("liufei");
	}
		
	
}