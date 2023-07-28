package org.sp.shop.admin.view.product;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//등록화면..
public class RegistPage extends ProductSubPage{
	JComboBox box_top;	//상위 카테고리
	JComboBox box_sub;	//하위 카테고리
	
	JTextField t_product_name;
	JTextField t_brand;
	JTextField t_price;
	//대표이미지는 파일 탐색기로 대체...
	JLabel la_path;	//선택한 이미지 경로 출력
	JButton bt_file;	//파일 탐색기 띄우는 버튼
	JPanel p_preview;	//선택한 이미지 미리보기
	
	JTextArea area;	//상세 내용 입력
	JScrollPane scroll;	
	
	public RegistPage() {
		box_top = new JComboBox();
		box_sub = new JComboBox();
		t_product_name = new JTextField();
		t_brand = new JTextField();
		t_price = new JTextField();
		la_path = new JLabel("이미지를 선택하세요");
		bt_file = new JButton("파일찾기");
		p_preview = new JPanel();//추후 그림을 직접 그리겠음
		area = new JTextArea();
		scroll = new JScrollPane(area);
		
		
		//스타일
		
		
		//조립
		add(box_top);
		add(box_sub);
		add(t_product_name);
		add(t_brand);
		add(t_price);
		add(la_path);
		add(bt_file);
		add(p_preview);
		add(scroll);
		
	}
	
	
}
