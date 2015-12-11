package com.projects.Text;
/**
 * Text Editor - Notepad style application that can open, edit, and save text documents. Optional: Add syntax highlighting and other features.
 * @author sudha
 *
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.JTextComponent;
import javax.swing.text.html.HTMLEditorKit;
public class TextEditor {



	    public static void main(String args[]) {

	  final String inputFilePath = "/Users/sudha/output.txt";

	  JFrame jFrame = new JFrame("Load ,Edit and Save file");

	  Container content = jFrame.getContentPane();

	  final JEditorPane edPane = new JEditorPane();

	  JScrollPane sPne = new JScrollPane(edPane);

	  content.add(sPne, BorderLayout.CENTER);

	  edPane.setEditorKit(new HTMLEditorKit());

	  JPanel jPanel = new JPanel();

	  Action Load = new AbstractAction() {

	@Override
	/*
	 * Action performed when save button gets clicked
	 */

	public void actionPerformed(ActionEvent event) {

	    try {

	  load(edPane, inputFilePath);

	    } catch (Exception e1) {

	  e1.printStackTrace();

	    }

	}

	  };

	  Load.putValue(Action.NAME, "Load");

	  JButton loadButton = new JButton(Load);

	  jPanel.add(loadButton);
/*
 * Action performed when save button gets clicked
 */
	  Action absActionSave = new AbstractAction() {

	@Override

	public void actionPerformed(ActionEvent event) {

	    try {

	  save(edPane, inputFilePath);

	    } catch (Exception e1) {

	  e1.printStackTrace();

	    }

	}

	  };

	  absActionSave.putValue(Action.NAME, "Save");

	  JButton jButton = new JButton(absActionSave);

	  jPanel.add(jButton);

	  Action absActionClear = new AbstractAction() {

	@Override
	/*
	 * Action performed when clear button gets clicked
	 */
	public void actionPerformed(ActionEvent event) {

	    edPane.setText("");

	}

	  };

	  absActionClear.putValue(Action.NAME, "Clear");

	  JButton clearButton = new JButton(absActionClear);

	  jPanel.add(clearButton);

	  content.add(jPanel, BorderLayout.SOUTH);

	  jFrame.setSize(800, 600);

	  jFrame.setVisible(true);
	    }

	    public static void save(JTextComponent text, String inputFile) throws Exception {

	  FileWriter writer = null;

	  writer = new FileWriter(inputFile);

	  text.write(writer);

	  writer.close();
	    }

	    public static void load(JTextComponent text, String inputFile) throws Exception {

	  FileReader inputReader = null;

	  inputReader = new FileReader(inputFile);

	  text.read(inputReader, inputFile);

	  inputReader.close();

	    }
	}

