import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;
	private String _nextPlayer = "F";
	private int _movesMade = 0;
	private int [] gameBoard = new int [9];
	private int _player1Score = 0;
	private int _player2Score = 0;
	private JTextField xScore;
	private JTextField oScore;
	private JTextField player1;
	private JTextField player2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	
	/**
	 *  rows 012 345 678
	 *  columns 036 147 258
	 *  diagonals 048 246 
	 */
	private void winGame() {
	    /**
	     * for case that only X win
	     * 
	     */
	    /**
	     * rows 012 345 678
	     */
	    if (gameBoard[0] == 1 && gameBoard[1] == 1 && gameBoard[2] == 1 ) {
	        JOptionPane.showMessageDialog(frame, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player1Score++;
	        xScore.setText(String.valueOf(_player1Score));
	        
	        
	    }else if (gameBoard[3] == 1 && gameBoard[4] == 1 && gameBoard[5] == 1 ) {
	        JOptionPane.showMessageDialog(frame, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player1Score++;
	        xScore.setText(String.valueOf(_player1Score));
	    }else if (gameBoard[6] == 1 && gameBoard[7] == 1 && gameBoard[8] == 1 ) {
	        JOptionPane.showMessageDialog(frame, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player1Score++;
	        xScore.setText(String.valueOf(_player1Score));
	    }
	    /**
	     * columns 036 147 258
	     */
	    else if (gameBoard[0] == 1 && gameBoard[3] == 1 && gameBoard[6] == 1 ) {
	        JOptionPane.showMessageDialog(frame, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player1Score++;
	        xScore.setText(String.valueOf(_player1Score));
	        
	    }else if (gameBoard[1] == 1 && gameBoard[4] == 1 && gameBoard[7] == 1 ) {
	        JOptionPane.showMessageDialog(frame, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player1Score++;
	        xScore.setText(String.valueOf(_player1Score));
	        
	    }else if (gameBoard[2] == 1 && gameBoard[5] == 1 && gameBoard[8] == 1 ) {
	        JOptionPane.showMessageDialog(frame, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player1Score++;
	        xScore.setText(String.valueOf(_player1Score));
	    }
	    /**
	     * diagonals 048 246
	     */
	    else if (gameBoard[0] == 1 && gameBoard[4] == 1 && gameBoard[8] == 1 ) {
	        JOptionPane.showMessageDialog(frame, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player1Score++;
	        xScore.setText(String.valueOf(_player1Score));
	        
	    }else if (gameBoard[2] == 1 && gameBoard[4] == 1 && gameBoard[6] == 1 ) {
	        JOptionPane.showMessageDialog(frame, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player1Score++;
	        xScore.setText(String.valueOf(_player1Score));
	    }
	    /**
	     * for case that only O win
	     */
	    /**
	     * rows 012 345 678
	     */
	    else if (gameBoard[0] == 2 && gameBoard[1] == 2 && gameBoard[2] == 2 ) {
	        JOptionPane.showMessageDialog(frame, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player2Score++;
	        oScore.setText(String.valueOf(_player2Score));
	        
	    }else if (gameBoard[3] == 2 && gameBoard[4] == 2 && gameBoard[5] == 2 ) {
	        JOptionPane.showMessageDialog(frame, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player2Score++;
	        oScore.setText(String.valueOf(_player2Score));
	        
	    }else if (gameBoard[6] == 2 && gameBoard[7] == 2 && gameBoard[8] == 2 ) {
	        JOptionPane.showMessageDialog(frame, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player2Score++;
	        oScore.setText(String.valueOf(_player2Score));
	    }
	    /**
	     * columns 036 147 258
	     */
	    else if (gameBoard[0] == 2 && gameBoard[3] == 2 && gameBoard[6] == 2 ) {
	        JOptionPane.showMessageDialog(frame, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player2Score++;
	        oScore.setText(String.valueOf(_player2Score));
	        
	    }else if (gameBoard[1] == 2 && gameBoard[4] == 2 && gameBoard[7] == 2 ) {
	        JOptionPane.showMessageDialog(frame, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player2Score++;
	        oScore.setText(String.valueOf(_player2Score));
	        
	    }else if (gameBoard[2] == 2 && gameBoard[5] == 2 && gameBoard[8] == 2 ) {
	        JOptionPane.showMessageDialog(frame, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player2Score++;
	        oScore.setText(String.valueOf(_player2Score));
	    
	    /**
	     * diagonals 048 246
	     */
	    }else if (gameBoard[0] == 2 && gameBoard[4] == 2 && gameBoard[8] == 2 ) {
	        JOptionPane.showMessageDialog(frame, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player2Score++;
	        oScore.setText(String.valueOf(_player2Score));
	        
	    }else if (gameBoard[2] == 2 && gameBoard[4] == 2 && gameBoard[6] == 2 ) {
	        JOptionPane.showMessageDialog(frame, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
	        _player2Score++;
	        oScore.setText(String.valueOf(_player2Score));
	        
	    }else if (_movesMade ==9 ){
	    	JOptionPane.showMessageDialog(frame, "Tied", ".", JOptionPane.INFORMATION_MESSAGE);
	    }
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(5, 3, 0, 0));
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(77, 77, 77)));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		

		
		/**
		 * Button 1
		 */
		JButton oneOne = new JButton();
		oneOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
		oneOne.setBackground(new Color(60, 179, 113));
		oneOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					oneOne.setText("X");
					oneOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneOne.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[0] = 1;
				}else if(_nextPlayer.equals("X")) {
					oneOne.setText("O");
					oneOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneOne.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[0] = 2;
				}else {
					oneOne.setText("X");
					oneOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneOne.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[0] = 1;
				}
				winGame();
			}
		});
		panel_1.add(oneOne, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(77, 77, 77)));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		/**
		 * Button 2
		 */
		JButton oneTwo = new JButton();
		oneTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
		oneTwo.setBackground(new Color(60, 179, 113));
		oneTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					oneTwo.setText("X");
					oneTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneTwo.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[1] = 1;
				}else if(_nextPlayer.equals("X")) {
					oneTwo.setText("O");
					oneTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneTwo.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[1] = 2;
				}else {
					oneTwo.setText("X");
					oneTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneTwo.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[1] = 1;
				}
				winGame();
			}
		});
		
		panel_2.add(oneTwo, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(77, 77, 77)));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		/**
		 * 
		 */
		JButton oneThree = new JButton("");
		oneThree.setBackground(new Color(60, 179, 113));
		oneThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					oneThree.setText("X");
					oneThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneThree.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[2] = 1;
				}else if(_nextPlayer.equals("X")) {
					oneThree.setText("O");
					oneThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneThree.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[2] = 2;
				}else {
					oneThree.setText("X");
					oneThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					oneThree.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[2] = 1;
				}
				winGame();
			}
		});
		panel_3.add(oneThree, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(77, 77, 77)));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton twoOne = new JButton("");
		twoOne.setBackground(new Color(60, 179, 113));
		twoOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					twoOne.setText("X");
					twoOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoOne.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[3] = 1;
				}else if(_nextPlayer.equals("X")) {
					twoOne.setText("O");
					twoOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoOne.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[3] = 2;
				}else {
					twoOne.setText("X");
					twoOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoOne.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[3] = 1;
				}
				winGame();
			}
		});
		panel_4.add(twoOne, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(77, 77, 77)));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton twoTwo = new JButton("");
		twoTwo.setBackground(new Color(60, 179, 113));
		twoTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					twoTwo.setText("X");
					twoTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoTwo.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[4] = 1;
				}else if(_nextPlayer.equals("X")) {
					twoTwo.setText("O");
					twoTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoTwo.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[4] = 2;
				}else {
					twoTwo.setText("X");
					twoTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoTwo.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[4] = 1;
				}
				winGame();
			}
		});
		panel_5.add(twoTwo, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(77, 77, 77)));
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton twoThree = new JButton("");
		twoThree.setBackground(new Color(60, 179, 113));
		twoThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					twoThree.setText("X");
					twoThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoThree.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[5] = 1;
				}else if(_nextPlayer.equals("X")) {
					twoThree.setText("O");
					twoThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoThree.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[5] = 2;
				}else {
					twoThree.setText("X");
					twoThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					twoThree.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[5] = 1;
				}
				winGame();
			}
		});
		panel_6.add(twoThree, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(77, 77, 77)));
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton threeOne = new JButton("");
		threeOne.setBackground(new Color(60, 179, 113));
		threeOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					threeOne.setText("X");
					threeOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					threeOne.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[6] = 1;
				}else if(_nextPlayer.equals("X")) {
					threeOne.setText("O");
					threeOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					threeOne.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[6] = 2;
				}else {
					threeOne.setText("X");
					threeOne.setFont(new Font("Tahoma", Font.PLAIN, 75));
					threeOne.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[6] = 1;
				}
				winGame();
			}
		});
		
		panel_7.add(threeOne, BorderLayout.CENTER);
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(77, 77, 77)));
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton ThreeTwo = new JButton("");
		ThreeTwo.setBackground(new Color(60, 179, 113));
		ThreeTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					ThreeTwo.setText("X");
					ThreeTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					ThreeTwo.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[7] = 1;
				}else if(_nextPlayer.equals("X")) {
					ThreeTwo.setText("O");
					ThreeTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					ThreeTwo.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[7] = 2;
				}else {
					ThreeTwo.setText("X");
					ThreeTwo.setFont(new Font("Tahoma", Font.PLAIN, 75));
					ThreeTwo.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[7] = 1;
				}
				winGame();
			}
		});
		
		panel_8.add(ThreeTwo, BorderLayout.CENTER);
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(77, 77, 77)));
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton threeThree = new JButton("");
		threeThree.setBackground(new Color(60, 179, 113));
		threeThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_nextPlayer.equals("F")) {
					threeThree.setText("X");
					threeThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					threeThree.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[8] = 1;
				}else if(_nextPlayer.equals("X")) {
					threeThree.setText("O");
					threeThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					threeThree.setForeground(Color.RED);
					_nextPlayer = "O";
					_movesMade++;
					gameBoard[8] = 2;
				}else {
					threeThree.setText("X");
					threeThree.setFont(new Font("Tahoma", Font.PLAIN, 75));
					threeThree.setForeground(Color.BLACK);
					_nextPlayer = "X";
					_movesMade++;
					gameBoard[8] = 1;
				}
				winGame();
			}
		});
		panel_9.add(threeThree, BorderLayout.CENTER);
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.WHITE, 2));
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		player1 = new JTextField("PLAYER 1");
		player1.setFont(new Font("Calibri", Font.BOLD, 30));
		player1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(player1, BorderLayout.CENTER);
		player1.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.WHITE, 2));
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		player2 = new JTextField("PLAYER 2");
		player2.setFont(new Font("Calibri", Font.BOLD, 30));
		player2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(player2, BorderLayout.CENTER);
		player2.setColumns(10);
		
		JPanel exitPanel = new JPanel();
		exitPanel.setBorder(new LineBorder(Color.WHITE, 2));
		frame.getContentPane().add(exitPanel);
		exitPanel.setLayout(new BorderLayout(0, 0));
		
		JButton exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.WHITE);
		exitButton.setForeground(new Color(255, 0, 51));
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Already Done?","", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		exitButton.setFont(new Font("Calibri", Font.BOLD, 32));
		exitPanel.add(exitButton, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.WHITE, 2));
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		xScore = new JTextField();
		xScore.setHorizontalAlignment(SwingConstants.CENTER);
		xScore.setForeground(Color.BLACK);
		xScore.setFont(new Font("Calibri", Font.BOLD, 60));
		panel_14.add(xScore, BorderLayout.CENTER);
		xScore.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.WHITE, 2));
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		oScore = new JTextField();
		oScore.setHorizontalAlignment(SwingConstants.CENTER);
		oScore.setForeground(Color.RED);
		oScore.setFont(new Font("Calibri", Font.BOLD, 60));
		panel_13.add(oScore, BorderLayout.CENTER);
		oScore.setColumns(10);
		
		JPanel restPanel = new JPanel();
		restPanel.setBorder(new LineBorder(Color.WHITE, 2));
		frame.getContentPane().add(restPanel);
		restPanel.setLayout(new BorderLayout(0, 0));
		
		JButton restButton = new JButton("REST");
		restButton.setBackground(Color.WHITE);
		restButton.setForeground(new Color(51, 102, 255));
		restButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oneOne.setText(null);
				oneTwo.setText(null);
				oneThree.setText(null);
				twoOne.setText(null);
				twoTwo.setText(null);
				twoThree.setText(null);
				threeOne.setText(null);
				ThreeTwo.setText(null);
				threeThree.setText(null);
				gameBoard[0] = 0;
				gameBoard[1] = 0;
				gameBoard[2] = 0;
				gameBoard[3] = 0;
				gameBoard[4] = 0;
				gameBoard[5] = 0;
				gameBoard[6] = 0;
				gameBoard[7] = 0;
				gameBoard[8] = 0;
				_movesMade = 0;
				_nextPlayer = "F";
			}
		});
		restButton.setFont(new Font("Calibri", Font.BOLD, 30));
		restPanel.add(restButton, BorderLayout.CENTER);
	}
}
