package MyFram2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.naming.directory.DirContext;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Choice;
import java.awt.TextField;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDanhSach extends JFrame {


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static ArrayList<Object> ds = new ArrayList<Object>();
	int kt = 0; // de kiem tra da nap du lieu vao hay chua ?

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDanhSach frame = new FrmDanhSach();

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmDanhSach() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Label label = new Label("Chon 1 lop");
		label.setBounds(10, 10, 62, 22);
		contentPane.add(label);

		Label label_1 = new Label("Ma sv");
		label_1.setBounds(10, 38, 62, 22);
		contentPane.add(label_1);

		Label label_2 = new Label("Ho va ten");
		label_2.setBounds(10, 66, 62, 22);
		contentPane.add(label_2);

		Label label_3 = new Label("Dtb");
		label_3.setBounds(10, 94, 62, 22);
		contentPane.add(label_3);

		TextField txtmasv = new TextField();
		txtmasv.setEditable(false);
		txtmasv.setBounds(112, 38, 137, 22);
		contentPane.add(txtmasv);

		TextField txtht = new TextField();
		txtht.setBounds(112, 66, 137, 22);
		contentPane.add(txtht);

		TextField txtdtb = new TextField();
		txtdtb.setBounds(112, 94, 137, 22);
		contentPane.add(txtdtb);

		Button btnnhap = new Button("Nhap");
		btnnhap.setBounds(275, 10, 70, 22);
		contentPane.add(btnnhap);

		Button btnluufile = new Button("Luu File");

		btnluufile.setBounds(354, 10, 70, 22);
		contentPane.add(btnluufile);

		Button btntimkiem = new Button("Tim Kiem");
		btntimkiem.setBounds(275, 38, 70, 22);
		contentPane.add(btntimkiem);

		Button btnsua = new Button("Sua");
		btnsua.setBounds(354, 38, 70, 22);
		contentPane.add(btnsua);

		Label label_4 = new Label("Danh sach cac sinh vien");
		label_4.setBounds(10, 122, 144, 22);
		contentPane.add(label_4);

		List list1 = new List();
		list1.setBounds(10, 150, 414, 101);
		contentPane.add(list1);

		Choice Choice1 = new Choice();
		Choice1.setBounds(112, 12, 137, 20);
		contentPane.add(Choice1);
		
		Button btnxoa = new Button("Xoa");
		btnxoa.setBounds(275, 66, 70, 22);
		contentPane.add(btnxoa);
		
		Button btnthoat = new Button("Thoat");
		btnthoat.setBounds(354, 66, 70, 22);
		contentPane.add(btnthoat);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					//mở file ds.txt
					FileInputStream FIS = new FileInputStream("ds.txt");
					InputStreamReader ISR = new InputStreamReader(FIS);
					BufferedReader BRds = new BufferedReader(ISR);

					while (true) {
						//đọc từng dòng
						String masv = BRds.readLine();
						if (masv == "" || masv == null || masv.isEmpty())
							break;
						String ht = BRds.readLine();
						String tenlop = BRds.readLine();
						Double dtb = Double.parseDouble(BRds.readLine());

						SinhVien sv = new SinhVien(masv, ht, tenlop, dtb); // khởi tạo một sinh viên mới từ dữ liệu file đọc được

						ds.add(sv); // thêm sinh viên vào ArrayList<Object> ds
					}
					
					BRds.close();
					//mở file khoa.txt
					FileInputStream FIS2 = new FileInputStream("Khoa.txt");
					InputStreamReader ISR2 = new InputStreamReader(FIS2);
					BufferedReader BRKhoa = new BufferedReader(ISR2);

					while (true) {
						String khoa = BRKhoa.readLine(); // đọc từng dòng lưu vào biến khoa
						if (khoa == "" || khoa == null || khoa.isEmpty())
							break;
						Choice1.add(khoa); // thêm biến khoa đọc được vào Choice1
					}
					BRKhoa.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				NapList(list1, txtmasv, txtht, txtdtb, Choice1.getSelectedItem());
				kt = 1;
			}
		});
		
		// sự kiện thay đổi giá trị ở choice
		// mỗi lần theo đổi thì nạp lại list theo giá trị selectedItem của Choice1
		Choice1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				NapList(list1, txtmasv, txtht, txtdtb, Choice1.getSelectedItem());
			}
		});
		
		//sự kiện thay đổi cái textfield khi thay đổi item ở List1
		list1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (kt != 0) { // đảm bảo rằng đã nạp List 
					String st = list1.getSelectedItem(); // lấy mã sinh viên chọn ở list1
					int dsSize = ds.size();
					for (int i = 0; i < dsSize; i++) { // duyệt ds
						SinhVien sv = (SinhVien) ds.get(i); // lấy mã sinh viên thứ i từ danh sach
						if(sv.masv.equals(st)){
							txtmasv.setText(sv.masv);
							txtht.setText(sv.ht);
							txtdtb.setText(String.valueOf(sv.dtb));
						}
					}
				}
			}
		});
		
		//sự kiện click vào button Nhap
		btnnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String masvnhap = JOptionPane.showInputDialog("Nhap vao masv can them: ");
				int ktma = 0; //kiểm tra mã đã tồn tại hay chưa
				int dsSize = ds.size();
				
				for (int i = 0; i < dsSize; i++) {
					SinhVien sv = (SinhVien) ds.get(i);
					if(sv.masv.equalsIgnoreCase(masvnhap)){
						ktma = 1; break; // nếu tồn tại mã sv, gán biến ktma = 1, thoát vòng for
					}
				}
				if (ktma == 0) { // nếu biến ktma = 0, tức vòng for trên làm biến ktma không thay đổi
					String htnhap = JOptionPane.showInputDialog("Nhap vao ho ten: ");
					
					String tenlopnhap = JOptionPane.showInputDialog("Nhap vao khoa: ");
					
					String dtbnhap = JOptionPane.showInputDialog("Nhap diem trung binh: ");
					//khởi tạo một SinhVien mới với dữ liệu ở các textfield
					SinhVien sv = new SinhVien(masvnhap, htnhap, tenlopnhap, Double.parseDouble(dtbnhap));
					
					ds.add(sv); // thêm vào ds
					
					NapList(list1, txtmasv, txtht, txtdtb, Choice1.getSelectedItem()); // nạp vào List
					JOptionPane.showMessageDialog(null, "Nhap thanh cong!");
				} else {
					JOptionPane.showMessageDialog(null, "Ma sinh vien da ton tai");
				}
			}
		});
		
		//sự kiện click vào nút Luu File
		btnluufile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// mở file ds.txt để ghi
					FileOutputStream FOS = new FileOutputStream("ds.txt");
					OutputStreamWriter OSW = new OutputStreamWriter(FOS);
					PrintWriter PWds = new PrintWriter(OSW);
					
					int dsSize = ds.size();
					for (int i = 0; i < dsSize; i++) {
						SinhVien sv = (SinhVien) ds.get(i);
						PWds.println(sv.masv);
						PWds.println(sv.ht);
						PWds.println(sv.tenlop);
						PWds.println(sv.dtb);
					}
					PWds.close();
					JOptionPane.showMessageDialog(null, "Luu file thanh cong!");
				} catch (FileNotFoundException e1) {
					JOptionPane.showMessageDialog(null, "Loi cmnr!");
				}
			}
		});
		
		
		//sự kiện click vào nút tìm kiếm
		btntimkiem.addActionListener(new ActionListener() {
			public int GetIndexOfChoiceName (Choice choice, String nameChoice) {
				int size = choice.getItemCount();
				for (int i = 0; i < size; i++) {
					if (choice.getItem(i).toLowerCase().equals(nameChoice.toLowerCase())) {
						return i;
					}
				}
				return -1;
			}
			public void actionPerformed(ActionEvent e) {
				String st = JOptionPane.showInputDialog("Nhap vao ma sv can tim");
				
				int dsSize = ds.size();
				for (int i = 0; i < dsSize; i++) {
					SinhVien sv = (SinhVien) ds.get(i);
					if(sv.masv.toLowerCase().equals(st)){
						txtmasv.setText(sv.masv);
						txtht.setText(sv.ht);
						txtdtb.setText(String.valueOf(sv.dtb));
						
						Choice1.select(GetIndexOfChoiceName(Choice1, sv.tenlop));
						return;
					}
				}
				JOptionPane.showMessageDialog(null, "Khong tim thay masv " + st);
			}
		});
		
		//sự kiện click vào nút sua
		btnsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dsSize = ds.size();
				for (int i = 0; i < dsSize; i++) { // duyệt ds
					SinhVien sv =  (SinhVien) ds.get(i);
					if(sv.masv.equals(txtmasv.getText())) {
						sv.DoiTen(txtht.getText());
						sv.DoiDtb(Double.parseDouble(txtdtb.getText()));
						String tenlop = Choice1.getSelectedItem();
						sv.DoiLop(tenlop);
						ds.set(i, sv); // không hiểu đoạn ni để làm chi
						NapList(list1, txtmasv, txtht, txtdtb, tenlop);
						JOptionPane.showMessageDialog(null, "Sua thanh cong");
					}
				}
			}
		});
		//sự kiện xóa
		btnxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogResult =  JOptionPane.showConfirmDialog(null, "Chac chan muon xoa?"); // cormfim diaglog (google để biết thêm chi tiết)
				
				if (dialogResult == JOptionPane.YES_NO_OPTION) {
					int dsSize = ds.size();
					for (int i = 0; i <dsSize; i++) {
						SinhVien sv = (SinhVien) ds.get(i);
						if(sv.masv.equals(txtmasv.getText())){
							ds.remove(i);
							NapList(list1, txtmasv, txtht, txtdtb, Choice1.getSelectedItem());
							JOptionPane.showMessageDialog(null, "Xoa thanh cong masv " + sv.masv);
							
						}
					}
				}
			}
		});
		//sự kiện thoát
		btnthoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // đóng form
			}
		});
	}

	// hàm NapList truyền List1, các textfield, tên lớp
	// duyệt mảng ds, thêm phần từ vào textfield, list1
	public void NapList(List list1, TextField txtmasv, TextField txtht, TextField txtdtb, String tenlop) {
		list1.clear();
		
		int dsSize = ds.size();
		for (int i = 0; i < dsSize; i++) {
			SinhVien sv = (SinhVien) ds.get(i);
			if (sv.tenlop.toLowerCase().equals(tenlop.toLowerCase())) {
				// nap du lieu vao text field;
				txtmasv.setText(sv.masv);
				txtht.setText(sv.ht);
				txtdtb.setText(String.valueOf(sv.dtb));
				// nap du lieu vao list
				list1.add(sv.masv);
				list1.add(sv.ht);
				list1.add(sv.tenlop);
				list1.add(String.valueOf(sv.dtb));
				list1.add("-------------------------------------");
			}
		}
	}
}
