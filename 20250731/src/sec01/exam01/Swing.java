package sec01.exam01;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing extends JFrame {
	String id = "root";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3305/DoItSQL";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = "select * from baseball";
	JLabel lb1 = new JLabel("이름");
	JLabel lb2 = new JLabel("타율");
	JLabel lb3 = new JLabel("OPS");
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JButton btn1 = new JButton("저장");
	JButton btn2 = new JButton("불러오기");
	JButton btn3 = new JButton("수정");
	JButton btn4 = new JButton("삭제");
	JTextArea ta = new JTextArea();
	
	public Swing() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공!");
			stmt = con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		con.add(lb1);
		lb1.setBounds(30, 10, 80, 40);
		con.add(lb2);
		lb2.setBounds(120, 10, 80, 40);
		con.add(lb3);
		lb3.setBounds(210, 10, 80, 40);
		
		con.add(tf1);
		tf1.setBounds(30, 50, 80, 40);
		con.add(tf2);
		tf2.setBounds(120, 50, 80, 40);
		con.add(tf3);
		tf3.setBounds(210, 50, 80, 40);
		
		con.add(btn1);
		btn1.setBounds(30, 100, 80, 40);
		
		con.add(btn2);
		btn2.setBounds(110, 100, 90, 40);
		
		con.add(btn3);
		btn3.setBounds(200, 100, 80, 40);
		
		con.add(btn4);
		btn4.setBounds(280, 100, 80, 40);
		
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta);
		sp.setBounds(30, 150, 250, 70);
		con.add(sp);
		
		this.setSize(400, 300);
		this.setLocation(800, 400);
		this.setTitle("스탯 입력 및 수정");
		showOrders();
		this.setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name1 = tf1.getText();
				String battingavg = tf2.getText();
				double ops = Double.parseDouble(tf3.getText());

				sql = String.format("insert into baseball(name1, battingavg, ops) values ('%s', '%s', %.3f)", 
						name1, battingavg, ops);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				showOrders();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showOrders();
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name1 = tf1.getText();
				String battingavg = tf2.getText();
				String ops = tf3.getText();

				sql = String.format("update baseball set battingavg = '%s', ops = %s where name1 = '%s'", 
						 name1, battingavg, ops);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				showOrders();
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name1 = tf1.getText();

				sql = String.format("delete from baseball where name1 = '%s'", name1);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				showOrders();
			}
		});
		
	}
	
	public void showOrders() {
		sql = "select * from baseball";
		try {
			rs = stmt.executeQuery(sql);
			String str = "";
			while (rs.next()) {
				String name1 = rs.getString("name1");
				String battingavg = rs.getString("battingavg");
				double ops = rs.getDouble("ops");
				
				str += String.format("%s\t%s\t%.3f\n", name1, battingavg, ops);
//				System.out.println(orderId + ", " + product + ", " + quantity);
			}
			ta.setText(str);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Swing();

	}

}




