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
	Image img0,img1,img2,img3,img4,currentImg;
	public MainCanvas(){
		try
		{
			/*
			��������ֵ
			�﷨����������=value;
			0��
			1��
			2��
			3��
			*/
			img0=Image.createImage("/sayo19.png");
			img1=Image.createImage("/sayo09.png");
			img2=Image.createImage("/sayo29.png");
			img3=Image.createImage("/sayo39.png");
			//img4=Image.createImage("/sayo00.png");
			currentImg=img0;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void paint(Graphics g){
		g.setColor(0,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,120,100,0);//120��X���ꡢ100��Y����
	}
	
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		/*
		action��ֵ��UP��DOWN��LEFT��RIGHT
		*/
		
			/*
			ʵ��ת�����
			*/
			/*
			���������¸�ֵ����
			*/
			
		if(action==LEFT){
			currentImg=img2;
			repaint();
		}else if(action==RIGHT){
			currentImg=img3;
			repaint();
		}else if(action==UP){
			currentImg=img1;
			repaint();
		}else if(action==DOWN){
			currentImg=img0;
			repaint();
		}
			
		
	}
	
}