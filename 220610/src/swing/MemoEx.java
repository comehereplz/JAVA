package swing;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MemoEx {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 450);

		JTextArea t = new JTextArea();
		f.add(t);
		f.setVisible(true);

		JMenuBar m = new JMenuBar();
		f.setJMenuBar(m);

		JMenu m_file = new JMenu("파일");
		m.add(m_file);
		JMenu m_edit = new JMenu("편집");
		m.add(m_edit);
		JMenu m_style = new JMenu("서식");
		m.add(m_style);
		JMenu m_view = new JMenu("보기");
		m.add(m_view);
		JMenu m_help = new JMenu("도움말");
		m.add(m_help);

		JMenuItem i_new = new JMenuItem("새로 만들기");
		JMenuItem i_open = new JMenuItem("열기");
		JMenuItem i_save = new JMenuItem("저장");
		JMenuItem i_end = new JMenuItem("끝내기");

		JMenuItem i_undo = new JMenuItem("실행취소");
		JMenuItem i_copy = new JMenuItem("복사하기");
		JMenuItem i_cut = new JMenuItem("잘라내기");
		JMenuItem i_paste = new JMenuItem("붙여넣기");
		JMenuItem i_find = new JMenuItem("찾기");

		m_file.add(i_new);
		m_file.add(i_open);
		m_file.add(i_save);
		m_file.add(i_end);

		m_edit.add(i_undo);
		m_edit.add(i_copy);
		m_edit.add(i_cut);
		m_edit.add(i_paste);
		m_edit.add(i_find);

		i_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog = new FileDialog(f, "저장하기", FileDialog.SAVE);
				dialog.setVisible(true);

				String path = dialog.getDirectory() + dialog.getFile();
				try {
					FileWriter w = new FileWriter(path);
					String s = t.getText();
					w.write(s);
					w.close();
				} catch (Exception e2) {
					System.out.println("저장 오류");
				}
			}
		});

		i_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog = new FileDialog(f, "불러오기", FileDialog.LOAD);
				dialog.setVisible(true);

				String path = dialog.getDirectory() + dialog.getFile();
				String s = "";
				try {
					FileReader r = new FileReader(path);
					int k;
					while (true) {
						if ((k = r.read()) == -1)
							break;
						s += (char) k;
					}
					r.close();
				} catch (Exception e2) {
					System.out.println("오류" + e);
				}

				t.setText(s);
			}
		});
		f.setVisible(true);

	}

}
