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
	Image img,img1,img2,img3,img4,img5,img6,currentImg;
	public MainCanvas(){
		try
		{
			/*
			��������ֵ
			�﷨����������=value;
			*/
			img=Image.createImage("/sayo10.png");
			img1=Image.createImage("/sayo12.png");
			img2=Image.createImage("/sayo16.png");
			img3=Image.createImage("/sayo24.png");
			img4=Image.createImage("/sayo00.png");
			img5=Image.createImage("/sayo02.png");
			img6=Image.createImage("/sayo22.png");
			currentImg=img;
			x = 120;
			y = 100;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void paint(Graphics g){
		g.setColor(0,0,0);
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
			currentImg=img6;
			x=x-5;
			System.out.println("����ת");
			repaint();
		}else if(action==RIGHT){
			currentImg=img2;
			x=x+5;
			System.out.println("����ת");
			repaint();
		}else if(action==DOWN){
			currentImg=img4;
			y=y+5;
			System.out.println("����ת");
			repaint();
		}else if(action==UP){
			currentImg=img3;
			y=y-5;
			System.out.println("����ת");
			repaint();
		}
	}
}