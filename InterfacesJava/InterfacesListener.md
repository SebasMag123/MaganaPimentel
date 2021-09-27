## Interfaces listener y sus metodos. JAVA

**1- Interface**: *Action listener*: La interfaz de escucha para recibir elementos de accion.

**Metodo**: *actionPerformed* (ActionEvent)



**2- Interface**: *AdjustmentListener* : La interfaz de escucha para recibir eventos de ajuste.

**Metodo**: *adjustmentValueChanged* (AdjustmentValueChanged)



**3- Interface**: *ComponentListener* : La interfaz de escucha para recibir eventos de commponentes

**Metodo**          
---------------------------------------|
*componentHidden* (ComponentEvent)     |
*componentMoved* (ComponentEvent)      |
*componentResized* (ComponentEvent)    |
*componentShown* (ComponentEvent)      |



**4- Interface**: *ContainerListener* : La interfaz de escucha para recibir eventos de contenedores

**Metodo**
---------------------------------------|
*ComponentAdded* (ComponentEvent)      |
*ComponentRemoved* (ComponentEvent)    | 



**5- Interface**: *FocusListener* : La interfaz de escucha para recibir eventos de teclado se centran en un componente

**Metodo**
---------------------------------------|
*focusGained* (FocusEvent)             |
*focusLost* (FocusEvent)               | 



**6- Interface**: *ItemListener* :  La interfaz de escucha para recibir eventos de elemento

**Metodo**: *itemStateChanged* (ItemEvent)



**7- Interface**: *KeyListener* : La interfaz de escucha para recibir eventos de teclado (combinaciones de teclas).

**Metodo**
---------------------------------------|
*keyPressed* (KeyEvent)                |
*keyTyped* (KeyEvent)                  |  



**8- Interface**: *MouseListener* : La interfaz de receptor para la recepción de "interesantes" eventos del ratón en un componente

**Metodo**
---------------------------------------|
*mouseClicked* (MouseEvent)            |
*mouseEntered* (MouseEvent)            | 
*mouseExited* (MouseEvent)             |
*mousePressed* (MouseEvent)            |
*mouseReleased* (MouseEvent)           |



**9- Interface**: *MouseMotionListener* : La interfaz de escucha para recibir eventos de ratón en movimiento en un componente

**Metodo**
---------------------------------------|
*mouseDragged* (MouseEvent)            |
*mouseMoved* (MouseEvent)              | 



**10- Interface**: *Texto* : Oyente

**Metodo** :textValueChanged (TextEvent)



**11- Interface**: *WindowListener*: La interfaz de escucha para recibir eventos de ventana

**Metodo**
---------------------------------------|
*windowActivated* (WindowEvent)        |
*windowClosed* (WindowEvent)           | 
*windowClosing* (windowEvent)          |
*windowDeactivated* (windowEvent)      |
*windowDeinconified* (windowEvent)     |
*windowIconified* (windowEvent)        |
*windowOpened* (windowEvent)           |