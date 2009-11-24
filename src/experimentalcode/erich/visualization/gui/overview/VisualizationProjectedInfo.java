package experimentalcode.erich.visualization.gui.overview;

import org.w3c.dom.Element;

import de.lmu.ifi.dbs.elki.visualization.VisualizationProjection;
import de.lmu.ifi.dbs.elki.visualization.svg.SVGPlot;
import experimentalcode.erich.visualization.visualizers.ProjectedVisualizer;

/**
 * Visualization info that needs projection information.
 * 
 * @author Erich Schubert
 */
class VisualizationProjectedInfo extends VisualizationInfo {
  /**
   * Projection to use in this visualization.
   */
  VisualizationProjection proj;

  /**
   * Visualizer to use.
   */
  ProjectedVisualizer vis;

  /**
   * Constructor.
   * 
   * @param vis Visualizer to use
   * @param proj Projection to use
   */
  public VisualizationProjectedInfo(ProjectedVisualizer vis, VisualizationProjection proj) {
    super();
    this.vis = vis;
    this.proj = proj;
  }

  @Override
  public Element build(SVGPlot plot) {
    synchronized(vis) {
      return vis.visualize(plot, proj);
    }
  }
}