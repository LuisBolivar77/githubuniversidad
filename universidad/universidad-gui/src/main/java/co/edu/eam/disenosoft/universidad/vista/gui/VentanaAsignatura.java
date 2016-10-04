/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.TipoAsignaturaEnum;
import co.edu.eam.disenosoft.universidad.vista.controladores.ControladorVentanaAsignatura;
import co.edu.eam.ingesoft.desarrollo.logica.excepcion.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOAsignaturaJPA;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;

/**
 *
 * @author dir_software
 */
public class VentanaAsignatura extends javax.swing.JInternalFrame implements ActionListener {

	private ControladorVentanaAsignatura adminAsignatura;

	/**
	 * Creates new form VentanaAsignatura
	 */
	public VentanaAsignatura() {
		initComponents();
		adminAsignatura = new ControladorVentanaAsignatura();
		setVisible(true);
		setMaximizable(false);
		setIconifiable(true);
		setResizable(false);
		setClosable(true);
		btnCrear.addActionListener(this);
		btnBuscar.addActionListener(this);
		brtnEditar.addActionListener(this);
		jBEliminar.addActionListener(this);
		comboTipoAsignatura.addItem(TipoAsignaturaEnum.PRACTICA);
		comboTipoAsignatura.addItem(TipoAsignaturaEnum.TEORICO_PRACTICA);
		comboTipoAsignatura.addItem(TipoAsignaturaEnum.TEORICA);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		comboTipoAsignatura = new javax.swing.JComboBox();
		tfcodigo = new javax.swing.JTextField();
		tfnombre = new javax.swing.JTextField();
		tfcreditos = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		tfSemestre = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		btnCrear = new javax.swing.JButton();
		btnBuscar = new javax.swing.JButton();
		brtnEditar = new javax.swing.JButton();
		jBEliminar = new javax.swing.JButton();

		setTitle("Administrar Asignaturas");
		setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/open161.png"))); // NOI18N

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Basicos"));

		jLabel1.setText("Codigo");

		jLabel2.setText("Nombre");

		jLabel3.setText("Creditos");

		jLabel4.setText("Tipo");

		jLabel5.setText("Semestre");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(
						jPanel1Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel1Layout.createSequentialGroup().addGap(23, 23, 23)
												.addGroup(
														jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel4).addComponent(jLabel1)
																.addComponent(jLabel2).addComponent(jLabel3)
																.addComponent(jLabel5))
												.addGap(64, 64, 64)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(tfcodigo)
														.addComponent(comboTipoAsignatura, 0, 268, Short.MAX_VALUE)
														.addComponent(tfnombre).addComponent(tfcreditos)
														.addComponent(tfSemestre))
												.addContainerGap(25, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(17, 17, 17)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(tfcreditos, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(comboTipoAsignatura,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(tfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(25, Short.MAX_VALUE)));

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculation1.png"))); // NOI18N

		btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N

		brtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pen38.png"))); // NOI18N

		jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete1600.png"))); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(
						jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
										.addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(brtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
								.addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(brtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(12, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents
		// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JButton brtnEditar;
	private javax.swing.JButton btnBuscar;
	private javax.swing.JButton btnCrear;
	private javax.swing.JComboBox comboTipoAsignatura;
	private javax.swing.JButton jBEliminar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField tfSemestre;
	private javax.swing.JTextField tfcodigo;
	private javax.swing.JTextField tfcreditos;
	private javax.swing.JTextField tfnombre;

	// End of variables declaration//GEN-END:variables
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == btnCrear) {

			try {
				TipoAsignaturaEnum tipoAsignatura = (TipoAsignaturaEnum) comboTipoAsignatura.getSelectedItem();
				String nombre = tfnombre.getText();
				String codigo = tfcodigo.getText();
				int numeroCreditos = Integer.parseInt(tfcreditos.getText());
				int semestre = Integer.parseInt(tfSemestre.getText());
				Asignatura asignatura = new Asignatura(nombre, codigo, tipoAsignatura, numeroCreditos, semestre);
				adminAsignatura.crear(asignatura);
				JOptionPane.showMessageDialog(null, "Se cre� correctamente");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (arg0.getSource() == brtnEditar) {

			try {
				TipoAsignaturaEnum tipoAsignatura = (TipoAsignaturaEnum) comboTipoAsignatura.getSelectedItem();
				String nombre = tfnombre.getText();
				String codigo = tfcodigo.getText();
				int numeroCreditos = Integer.parseInt(tfcreditos.getText());
				int semestre = Integer.parseInt(tfSemestre.getText());
				Asignatura asignatura = new Asignatura(nombre, codigo, tipoAsignatura, numeroCreditos, semestre);
				adminAsignatura.editar(asignatura);
				JOptionPane.showMessageDialog(null, "Se edit� correctamente");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (arg0.getSource() == btnBuscar) {

			try {
				String cod = tfcodigo.getText();
				Asignatura as = adminAsignatura.buscar(cod);
				tfcodigo.setText(as.getCodigo());
				tfcreditos.setText(as.getNumeroCreditos() + "");
				tfnombre.setText(as.getNombre());
				comboTipoAsignatura.setSelectedItem(as.getTipo());
				tfSemestre.setText(as.getSemestre() + "");

			} catch (ExcepcionNegocio exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (arg0.getSource() == jBEliminar) {
			try {
				String codigo = tfcodigo.getText();
				adminAsignatura.eliminar(codigo);
				JOptionPane.showMessageDialog(null, "Se ha elimando correctamente");
			} catch (ExcepcionNegocio exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}