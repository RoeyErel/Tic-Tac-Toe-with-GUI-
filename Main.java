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
	
	/**
	 * @param _nextPlayer - the next player to play.
	 * @param _movesMade - number of moves made.
	 * @param gameBoard - Represent the board.
	 * @param _player1Score - Player 1 score.
	 * @param _player2Score - Player 2 score.
	 * @param xScore - X player score.
	 * @param oScore - O player score.
	 * @param player1 - Name of the first player.
	 * @param player2 - Name of the second player.
	 */
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
	 * The method checking if one of the users win.
	 * Possible win can get by the following sequences.
	 * Board numbered as
	 * 0 1 2
	 * 3 4 5
	 * 6 7 8
	 * rows sequence: 012 345 678
	 * columns sequence: 036 147 258
	 * diagonals sequence: 048 246 
	 */
	private void winGame() {
	    /**
	     * Checking X player possible win.
	     * 
	     */
	    /**
	     * Check possible row sequence at rows 012 345 678.
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
	     * Check possible columns sequence at columns 036 147 258.
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
	     * Check possible diagonals sequence at diagonals 048 246.
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
	     * Checking O player possible win.
	     */
	    /**
	     * Check possible row sequence at rows 012 345 678.
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
	     * Check possible columns sequence at columns 036 147 258.
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
	     * Check possible diagonals sequence at diagonals 048 246.
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
	}// end of winGame method
	
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
		 * The first button first row at the first column
		 * @actionPerformed place a X/O on the board.
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
		 * The second button first row at the second column
		 * @actionPerformed place a X/O on the board.
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
		 * The third button first row at the third column
		 * @actionPerformed place a X/O on the board.
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
		
		/**
		 * The fourth button second row at the first column
		 * @actionPerformed place a X/O on the board.
		 */
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
		
		/**
		 * The fifth button second row at the second column
		 * @actionPerformed place a X/O on the board.
		 */
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
		
		/**
		 * The sixth button second row at the third column
		 * @actionPerformed place a X/O on the board.
		 */
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
		
		/**
		 * The seventh button third row at the first column
		 * @actionPerformed place a X/O on the board.
		 */
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
		
		/**
		 * The eighth  button third row at the second column
		 * @actionPerformed place a X/O on the board.
		 */
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
		
		/**
		 * The ninth  button third row at the third column
		 * @actionPerformed place a X/O on the board.
		 */
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
		
		/**
		 * First player, the X player
		 * Name can be edited
		 */
		player1 = new JTextField("PLAYER 1");
		player1.setFont(new Font("Calibri", Font.BOLD, 30));
		player1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(player1, BorderLayout.CENTER);
		player1.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.WHITE, 2));
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		/**
		 * Second player, the O player.
		 * Name can be edited
		 */
		player2 = new JTextField("PLAYER 2");
		player2.setFont(new Font("Calibri", Font.BOLD, 30));
		player2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(player2, BorderLayout.CENTER);
		player2.setColumns(10);
		
		JPanel exitPanel = new JPanel();
		exitPanel.setBorder(new LineBorder(Color.WHITE, 2));
		frame.getContentPane().add(exitPanel);
		exitPanel.setLayout(new BorderLayout(0, 0));
		
		/**
		 * The exit button, after click show dialog with Yes/No option
		 * @mouseClicked Yes/No option, yes for exit the program.
		 */
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
		
		/**
		 * Represent the score of the X player
		 */
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
		/**
		 * Represent the score of the X player
		 */
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
		/**
		 * Rest the game, board and the keep score.
		 * @mouseClicked restart the game.
		 */
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
