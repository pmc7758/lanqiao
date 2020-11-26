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
	变量的声明
	语法：数据类型 变量名称（标识符）;
	*/
	Image img0,img1,img2,img3,img4,currentImg;
	public MainCanvas(){
		try
		{
			/*
			给变量赋值
			语法：变量名称=value;
			0上
			1下
			2左
			3右
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
		g.drawImage(currentImg,120,100,0);//120：X坐标、100：Y坐标
	}
	
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		/*
		action的值：UP、DOWN、LEFT、RIGHT
		*/
		
			/*
			实现转向代码
			*/
			/*
			给变量重新赋值即可
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