import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;

public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}


class MainCanvas extends Canvas
{

	/*
	����������
	�﷨���������� �������ƣ���ʶ����;
	*/
	
	int x,y;
	Image heroImage[][] = new Image[4][3];
	Image currentImg;

	boolean k = true;

	

	/*
	Image[] img = new Image[];
	boolean i = true;
	for(int i=1;i<10;i++){
		img[0]=Image.createImage("/sayo" + i + ".png");
	}*/


	//Image img,img1,img2,img3,img4,img5,img6,currentImg;


	public MainCanvas(){
		try
		{




			for(int i=0;i<heroImage.length;i++){
				for(int p=0;p<heroImage[i].length;p++){
					heroImage[i][p]=Image.createImage("/sayo"+i+p+".png");
				}
			}
			/*
			��������ֵ
			�﷨����������=value;
			*/
			/*
			for(int i=0;i<heroImg.length;i++){
				for(int j=0;j<heroImg[i].length;j++){
					heroImg=Image.creatImage("/sayo" + i + j + ".png");
				}
			}
*/


			currentImg=heroImage[0][1];
			x = 120;
			y = 100;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


	public void paint(Graphics g){
		g.setColor(48,128,20);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,x,y,0);//120��X���ꡢ100��Y����
	}


	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		/*
		action��ֵ��UP��DOWN��LEFT��RIGHT
		*/
		if(action==LEFT){
			/*
			ʵ��ת�����
			*/
			/*
			���������¸�ֵ����
			*/
			changePicAndDir(1,0,1);
			x=x-5;
			System.out.println("����ת");
			repaint();
		}else if(action==RIGHT){
			changePicAndDir(3,0,2);
			x=x+5;
			System.out.println("����ת");
			repaint();
		}else if(action==DOWN){
			changePicAndDir(0,0,2);
			y=y+5;
			System.out.println("����ת");
			repaint();
		}else if(action==UP){
			changePicAndDir(2,2,1);
			y=y-5;
			System.out.println("����ת");
			repaint();
		}
	}


	private void changePicAndDir(int x,int y,int z){
		if(k){
			currentImg=heroImage[x][y];
			k = false;
		}else if(!k){
			currentImg=heroImage[x][z];
			k = true;
		}
	}

}