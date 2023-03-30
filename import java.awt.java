import java.awt.FlowLayout;
import java.awt.Contrainer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{
    private JButton LeftJButton;
    private JButton centerJButton;
    private JButton rightJButton;
    private FlowLayout layout;
    private Container container;

    public FlowLayoutFrame()
    {
       super("FlowLayoutFrame Demo");

      layout = new FlowLayout();
      container = getContentPane();
      setLayout( layout );

      LeftJButton = new JButton( "Left" );
      add( LeftJButton );
      LeftJButton.addActionListener()

      new ActionListener()
      {

        public void actionPerformed( ActionEvent event )
        {
            Layout.setAlignment( FlowLayout.LEFT );

            layout.LayoutContainer( container);

            centerJButton = new JButton("Center");
            add( centerJButton ):
            centerJButton.addActionListener()

            new ActionListener()
            {
              public void actionPerformed( Action event);
              {
                layout.setAlignment( FlowLayout.Center);

                layout.LayoutContainer( container);
              }

            
            }
            rightJButton =new JButton("Right ");
            add( rightJButton);

            rightJButton.addActionListener()

            new ActionListener()
            {

                public void actionPerformed( ActionEvent event )
                {
                    layout.setAlignment(FlowLayout.Right);

                    Layout.LayoutContainer(container);

                }
            } 
        }
      }
    
    }
}