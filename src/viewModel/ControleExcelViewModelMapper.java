package viewModel;

import Dto.LineDTO;

public class ControleExcelViewModelMapper {
	
	public static LineDTO to(String[] log) {
		LineDTO lineDto = new LineDTO();
		lineDto.setData(log[0]);
		lineDto.setIdConsentimento(log[1]);
		lineDto.setIdPessoa(log[2]);
		lineDto.setIdMarca(log[3]);
		lineDto.setIdSegmento(log[4]);
		lineDto.setLog(log[4]);
		lineDto.setExcepition(log[5]);
		return lineDto;
	}

}
