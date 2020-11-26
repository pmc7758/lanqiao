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
	boolean k = true;
	int x,y;
	Image[] heroImg0 = new Image[2];
	Image[] heroImg1 = new Image[2];
	Image[] heroImg2 = new Image[2];
	Image[] heroImg3 = new Image[2];
	Image currentImg;
	//Image img0,img1,img2,img3,img4,currentImg;
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
			for(int p=0;p<heroImg0.length;p++){
				heroImg0[p] = Image.createImage("/sayo1"+p+".png");
			}

			for(int i=0;i<heroImg1.length;i++){
				heroImg1[i] = Image.createImage("/sayo0"+i+".png");
			}

			for(int j=0;j<heroImg2.length;j++){
				heroImg2[j] = Image.createImage("/sayo2"+j+".png");
			}

			for(int o=0;o<heroImg3.length;o++){
				heroImg3[o] = Image.createImage("/sayo3"+o+".png");
			}

			x=120;
			y=100;
			//img0=Image.createImage("/sayo19.png");
			//img1=Image.createImage("/sayo09.png");
			//img2=Image.createImage("/sayo29.png");
			//img3=Image.createImage("/sayo39.png");
			//img4=Image.createImage("/sayo00.png");
			currentImg=heroImg1[1];
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
		
			/*
			ʵ��ת�����
			*/
			/*
			���������¸�ֵ����
			*/
			
		if(action==LEFT){

		if(k){
			currentImg=heroImg2[0];
			k = false;
			}else if(!k){
			currentImg=heroImg2[1];
			k = true;
			}
			x=x-5;
			repaint();
		}else if(action==RIGHT){
			if(k){
			currentImg=heroImg3[0];
			k = false;
			}else if(!k){
			currentImg=heroImg3[1];
			k = true;
			}
			x=x+5;
			repaint();
		}else if(action==UP){
			if(k){
			currentImg=heroImg1[0];
			k = false;
			}else if(!k){
			currentImg=heroImg1[1];
			k = true;
			}
			y=y-5;
			repaint();
		}else if(action==DOWN){
			if(k){
			currentImg=heroImg0[0];
			k = false;
			}else if(!k){
			currentImg=heroImg0[1];
			k = true;
			}
			y=y+5;
			repaint();
		}
			
		
	}
	
}